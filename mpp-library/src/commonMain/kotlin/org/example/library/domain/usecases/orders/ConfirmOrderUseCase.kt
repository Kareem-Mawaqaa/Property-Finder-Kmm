 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class ConfirmOrderUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<ConfirmOrderResponse>> = flow {
        try {
            emit(DataState.loading<ConfirmOrderResponse>())

            val result = service.confirmOrder( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<ConfirmOrderResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    