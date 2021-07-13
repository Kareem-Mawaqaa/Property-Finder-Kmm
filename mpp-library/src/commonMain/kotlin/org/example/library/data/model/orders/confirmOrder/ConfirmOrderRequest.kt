package org.example.library.data.model.orders.confirmOrder


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConfirmOrderRequest(
	@SerialName("order_id")
	var order_id : Int? = null,
) 