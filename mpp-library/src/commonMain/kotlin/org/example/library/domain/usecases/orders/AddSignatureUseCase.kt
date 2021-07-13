 
package org.example.library.domain.usecases.orders

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.orders.addSignature.AddSignatureRequest                      
import org.example.library.data.model.orders.addSignature.AddSignatureResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.orders.OrdersApiService

class AddSignatureUseCase(val service: OrdersApiService) {

    fun execute(request: AddSignatureRequest): Flow<DataState<AddSignatureResponse>> = flow {
        try {
            emit(DataState.loading<AddSignatureResponse>())

            val result = service.addSignature( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<AddSignatureResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    