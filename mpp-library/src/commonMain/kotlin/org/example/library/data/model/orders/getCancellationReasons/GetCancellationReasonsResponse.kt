package org.example.library.data.model.orders.getCancellationReasons

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetCancellationReasonsResponse(
	@SerialName("cancellation_reasons")
	@Contextual
	var cancellation_reasons : ArrayList<Cancellation_reasons>? = null,
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
) 