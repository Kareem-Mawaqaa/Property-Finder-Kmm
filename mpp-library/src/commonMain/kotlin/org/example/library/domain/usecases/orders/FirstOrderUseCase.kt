 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.firstOrder.FirstOrderResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class FirstOrderUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<FirstOrderResponse>> = flow {
        try {
            emit(DataState.loading<FirstOrderResponse>())

            val result = service.firstOrder( HashMap())

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<FirstOrderResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    