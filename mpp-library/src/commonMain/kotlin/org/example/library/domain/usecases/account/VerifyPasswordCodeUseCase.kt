 
package org.example.library.domain.usecases.account

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeRequest                      
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.account.AccountApiService

class VerifyPasswordCodeUseCase(val service: AccountApiService) {

    fun execute(request: VerifyPasswordCodeRequest): Flow<DataState<VerifyPasswordCodeResponse>> = flow {
        try {
            emit(DataState.loading<VerifyPasswordCodeResponse>())

            val result = service.verifyPasswordCode( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<VerifyPasswordCodeResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    