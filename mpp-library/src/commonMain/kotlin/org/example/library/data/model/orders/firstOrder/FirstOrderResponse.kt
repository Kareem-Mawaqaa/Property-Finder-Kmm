package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FirstOrderResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
	@SerialName("order")
	@Contextual
	var order : Order? = null,
) 