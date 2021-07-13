 
package org.example.library.domain.usecases.account

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeRequest                      
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.account.AccountApiService

class SendPasswordCodeUseCase(val service: AccountApiService) {

    fun execute(request: SendPasswordCodeRequest): Flow<DataState<SendPasswordCodeResponse>> = flow {
        try {
            emit(DataState.loading<SendPasswordCodeResponse>())

            val result = service.sendPasswordCode( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<SendPasswordCodeResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    