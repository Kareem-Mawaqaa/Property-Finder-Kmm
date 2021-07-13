 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
                      
import org.example.library.data.model.orders.completedJourney.CompletedJourneyResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class CompletedJourneyUseCase(val service: OrdersApiService) {

    fun execute(): Flow<DataState<CompletedJourneyResponse>> = flow {
        try {
            emit(DataState.loading<CompletedJourneyResponse>())

            val result = service.completedJourney( )

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<CompletedJourneyResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    