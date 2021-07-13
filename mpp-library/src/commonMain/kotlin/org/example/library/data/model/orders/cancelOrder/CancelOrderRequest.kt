package org.example.library.data.model.orders.cancelOrder


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CancelOrderRequest(
	@SerialName("comment")
	var comment : String? = null,
	@SerialName("cancellation_reason_id")
	var cancellation_reason_id : Int? = null,
	@SerialName("order_id")
	var order_id : Int? = null,
) 