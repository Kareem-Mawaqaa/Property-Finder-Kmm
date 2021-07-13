package org.example.library.data.model.orders.inJourney

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InJourneyResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
) 