 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.assignedOrder.AssignedOrderResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class AssignedOrderUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<AssignedOrderResponse>> = flow {
        try {
            emit(DataState.loading<AssignedOrderResponse>())

            val result = service.assignedOrder( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<AssignedOrderResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    