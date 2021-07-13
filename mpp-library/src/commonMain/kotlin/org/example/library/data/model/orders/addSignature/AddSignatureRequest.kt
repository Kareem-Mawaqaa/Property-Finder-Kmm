package org.example.library.data.model.orders.addSignature


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddSignatureRequest(
	@SerialName("order_id")
	var order_id : String? = null,
) 