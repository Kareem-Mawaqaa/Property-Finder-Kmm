package org.example.library.data.model.orders.orderDetails

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.library.data.model.orders.assignedOrder.Orders

@Serializable
data class OrderDetailsResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
	@SerialName("order")
	@Contextual
	var order : Orders? = null,
) 