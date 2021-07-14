package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AssignedOrderResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("orders")
	@Contextual
	var orders : ArrayList<Orders>? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
) 