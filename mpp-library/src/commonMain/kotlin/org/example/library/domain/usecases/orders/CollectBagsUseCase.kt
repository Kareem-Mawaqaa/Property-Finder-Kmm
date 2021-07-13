 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.orders.collectBags.CollectBagsRequest                      
import org.example.library.data.model.orders.collectBags.CollectBagsResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class CollectBagsUseCase(val service: OrdersApiService) {

    fun execute(request: CollectBagsRequest): Flow<DataState<CollectBagsResponse>> = flow {
        try {
            emit(DataState.loading<CollectBagsResponse>())

            val result = service.collectBags( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<CollectBagsResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    