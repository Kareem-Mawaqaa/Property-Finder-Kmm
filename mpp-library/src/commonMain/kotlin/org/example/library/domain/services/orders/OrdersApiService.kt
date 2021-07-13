package org.example.library.domain.services.orders

import org.example.library.data.model.orders.getCancellationReasons.GetCancellationReasonsResponse
import org.example.library.data.model.orders.inJourney.InJourneyResponse
import org.example.library.data.model.orders.firstOrder.FirstOrderResponse
import org.example.library.data.model.orders.addSignature.AddSignatureResponse
import org.example.library.data.model.orders.cancelOrder.CancelOrderResponse
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderResponse
import org.example.library.data.model.orders.completedJourney.CompletedJourneyResponse         



import org.example.library.data.model.orders.addSignature.AddSignatureRequest
import org.example.library.data.model.orders.cancelOrder.CancelOrderRequest


        
interface OrdersApiService {

    suspend fun getCancellationReasons(): GetCancellationReasonsResponse
	suspend fun inJourney(): InJourneyResponse
	suspend fun firstOrder(map: HashMap<String,String>): FirstOrderResponse
	suspend fun addSignature(request: AddSignatureRequest): AddSignatureResponse
	suspend fun cancelOrder(request: CancelOrderRequest): CancelOrderResponse
	suspend fun confirmOrder(): ConfirmOrderResponse
	suspend fun completedJourney(): CompletedJourneyResponse
   
}
            
