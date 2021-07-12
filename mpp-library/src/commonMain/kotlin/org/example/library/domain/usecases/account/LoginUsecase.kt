package org.example.library.domain.usecases.account

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.account.login.LoginRequest
import org.example.library.data.account.login.LoginResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.service.account.AccountApiService

class LoginUsecase(val service: AccountApiService) {

    fun execute(
        loginRequest: LoginRequest,
    ): Flow<DataState<LoginResponse>> = flow {

        if (loginRequest.oCustomer.Email?.isEmpty() == true) {
            emit(DataState.error("dasdas"))
            return@flow
        }

        try {
            emit(DataState.loading())

            // just to show loading, cache is fast
            delay(1000)

            val result = service.login(loginRequest)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<LoginResponse>(e.message ?: "Unknown Error"))
        }
    }


}