package org.example.library.data.model.orders.addSignature

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddSignatureResponse(
	@SerialName("vaildation_message")
	@Contextual
	var vaildation_message : Vaildation_message? = null,
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
) 