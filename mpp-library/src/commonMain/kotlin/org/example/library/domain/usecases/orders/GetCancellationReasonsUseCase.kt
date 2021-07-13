 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.getCancellationReasons.GetCancellationReasonsResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class GetCancellationReasonsUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<GetCancellationReasonsResponse>> = flow {
        try {
            emit(DataState.loading<GetCancellationReasonsResponse>())

            val result = service.getCancellationReasons( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<GetCancellationReasonsResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    