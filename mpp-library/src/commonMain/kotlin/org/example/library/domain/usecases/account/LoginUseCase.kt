 
package org.example.library.domain.usecases.account

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.account.login.LoginRequest                      
import org.example.library.data.model.account.login.LoginResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.account.AccountApiService

class LoginUseCase(val service: AccountApiService) {

    fun execute(request: LoginRequest): Flow<DataState<LoginResponse>> = flow {
        try {
            emit(DataState.loading<LoginResponse>())

            val result = service.login( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<LoginResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    