 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.collectedOrder.CollectedOrderResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class CollectedOrderUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<CollectedOrderResponse>> = flow {
        try {
            emit(DataState.loading<CollectedOrderResponse>())

            val result = service.collectedOrder( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<CollectedOrderResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    