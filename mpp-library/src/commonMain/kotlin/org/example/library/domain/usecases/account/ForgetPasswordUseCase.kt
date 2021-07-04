package org.example.library.domain.usecases.account

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.account.forgetPassword.ForgetPasswordRequest
import org.example.library.data.account.forgetPassword.ForgetPasswordResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.service.account.AccountApiService

class ForgetPasswordUseCase(val service: AccountApiService) {

    // TODO Handle it Here

    fun execute(request: ForgetPasswordRequest): Flow<DataState<ForgetPasswordResponse>> =
        flow {

            try {
                emit(DataState.loading())

                val response = service.forgetPassword(request)
                emit(DataState.success(response))
            } catch (ex: Exception) {
                emit(DataState.error<ForgetPasswordResponse>(ex.message ?: "Unknown Error"))

            }

        }
}