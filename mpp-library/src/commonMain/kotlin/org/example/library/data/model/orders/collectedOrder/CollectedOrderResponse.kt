package org.example.library.data.model.orders.collectedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.library.data.model.orders.assignedOrder.Orders

@Serializable
data class CollectedOrderResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,

	@SerialName("orders")
	var orders: ArrayList<Orders>? = null,
) 