 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.orders.cancelOrder.CancelOrderRequest                      
import org.example.library.data.model.orders.cancelOrder.CancelOrderResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class CancelOrderUseCase(val service: OrdersApiService) {

    fun execute(request: CancelOrderRequest): Flow<DataState<CancelOrderResponse>> = flow {
        try {
            emit(DataState.loading<CancelOrderResponse>())

            val result = service.cancelOrder( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<CancelOrderResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    