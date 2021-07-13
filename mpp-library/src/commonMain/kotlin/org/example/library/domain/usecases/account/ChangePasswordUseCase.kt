 
package org.example.library.domain.usecases.account

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.account.changePassword.ChangePasswordRequest                      
import org.example.library.data.model.account.changePassword.ChangePasswordResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.account.AccountApiService

class ChangePasswordUseCase(val service: AccountApiService) {

    fun execute(request: ChangePasswordRequest): Flow<DataState<ChangePasswordResponse>> = flow {
        try {
            emit(DataState.loading<ChangePasswordResponse>())

            val result = service.changePassword( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<ChangePasswordResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    