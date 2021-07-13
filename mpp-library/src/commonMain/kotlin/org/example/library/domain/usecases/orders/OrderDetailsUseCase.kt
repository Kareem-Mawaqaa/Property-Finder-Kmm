 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.orderDetails.OrderDetailsResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class OrderDetailsUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<OrderDetailsResponse>> = flow {
        try {
            emit(DataState.loading<OrderDetailsResponse>())

            val result = service.orderDetails( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<OrderDetailsResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    