package org.example.library.domain.services.orders

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.library.di.ServiceLocatorInstance
import org.example.library.data.model.orders.getCancellationReasons.GetCancellationReasonsResponse
import org.example.library.data.model.orders.inJourney.InJourneyResponse
import org.example.library.data.model.orders.firstOrder.FirstOrderResponse
import org.example.library.data.model.orders.addSignature.AddSignatureResponse
import org.example.library.data.model.orders.cancelOrder.CancelOrderResponse
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderResponse
import org.example.library.data.model.orders.completedJourney.CompletedJourneyResponse         



import org.example.library.data.model.orders.addSignature.AddSignatureRequest
import org.example.library.data.model.orders.cancelOrder.CancelOrderRequest


        
class OrdersApiServiceImpl :  OrdersApiService {

    private val BASE_URL = "http://flythru.phpmawaqaa.com/api"

    fun client() = ServiceLocatorInstance.provide(HttpClient::class)
    
        
    override suspend fun getCancellationReasons(): GetCancellationReasonsResponse  {
         return client().get("$BASE_URL/driver/cancellation_reasons") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

	
        
    override suspend fun inJourney(): InJourneyResponse  {
         return client().get("$BASE_URL/driver/journey") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

	
        
    override suspend fun firstOrder(map: HashMap<String,String>): FirstOrderResponse  {
         return client().get("$BASE_URL/driver/first_order") {
                contentType(ContentType.Application.Json)
                
                map.forEach{
					 parameter(it.key , it.value) 
			}
         }
    }

	
        
    override suspend fun addSignature(request: AddSignatureRequest): AddSignatureResponse  {
         return client().post("$BASE_URL/driver/add_signature") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun cancelOrder(request: CancelOrderRequest): CancelOrderResponse  {
         return client().post("$BASE_URL/driver/cancel") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun confirmOrder(): ConfirmOrderResponse  {
         return client().get("$BASE_URL/driver/confirm/49") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

	
        
    override suspend fun completedJourney(): CompletedJourneyResponse  {
         return client().get("$BASE_URL/driver/completed_journey") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

   
}
