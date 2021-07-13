package org.example.library.domain.services.orders

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.library.di.ServiceLocatorInstance
import org.example.library.data.model.orders.assignedOrder.AssignedOrderResponse
import org.example.library.data.model.orders.orderDetails.OrderDetailsResponse
import org.example.library.data.model.orders.collectBags.CollectBagsResponse
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderResponse
import org.example.library.data.model.orders.collectedOrder.CollectedOrderResponse         


import org.example.library.data.model.orders.collectBags.CollectBagsRequest
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderRequest

        
class OrdersApiServiceImpl :  OrdersApiService {

    private val BASE_URL = "http://l7m.mawaqaademos.com/api"

    fun client() = ServiceLocatorInstance.provide(HttpClient::class)
    
        
    override suspend fun assignedOrder(): AssignedOrderResponse  {
         return client().get("$BASE_URL/porter/order/assigned") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

	
        
    override suspend fun orderDetails(): OrderDetailsResponse  {
         return client().get("$BASE_URL/porter/order/show/41") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

	
        
    override suspend fun collectBags(request: CollectBagsRequest): CollectBagsResponse  {
         return client().post("$BASE_URL/porter/order/collect_bag") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun confirmOrder(request: ConfirmOrderRequest): ConfirmOrderResponse  {
         return client().post("$BASE_URL/porter/order/confirm_order") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun collectedOrder(): CollectedOrderResponse  {
         return client().get("$BASE_URL/porter/order/collected") {
                contentType(ContentType.Application.Json)
                
                
         }
    }

   
}
