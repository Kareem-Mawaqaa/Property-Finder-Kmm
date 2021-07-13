 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.inJourney.InJourneyResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class InJourneyUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<InJourneyResponse>> = flow {
        try {
            emit(DataState.loading<InJourneyResponse>())

            val result = service.inJourney( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<InJourneyResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    