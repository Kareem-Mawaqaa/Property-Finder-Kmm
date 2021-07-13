package org.example.library.domain.services.orders

import org.example.library.data.model.orders.assignedOrder.AssignedOrderResponse
import org.example.library.data.model.orders.orderDetails.OrderDetailsResponse
import org.example.library.data.model.orders.collectBags.CollectBagsResponse
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderResponse
import org.example.library.data.model.orders.collectedOrder.CollectedOrderResponse         


import org.example.library.data.model.orders.collectBags.CollectBagsRequest
import org.example.library.data.model.orders.confirmOrder.ConfirmOrderRequest

        
interface OrdersApiService {

    suspend fun assignedOrder(): AssignedOrderResponse
	suspend fun orderDetails(): OrderDetailsResponse
	suspend fun collectBags(request: CollectBagsRequest): CollectBagsResponse
	suspend fun confirmOrder(request: ConfirmOrderRequest): ConfirmOrderResponse
	suspend fun collectedOrder(): CollectedOrderResponse
   
}
            
