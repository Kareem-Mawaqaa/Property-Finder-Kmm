package org.example.library.data.model.orders.getCancellationReasons

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Cancellation_reasons(
	@SerialName("id")
	var id : Int? = null,
	@SerialName("title")
	var title : String? = null,
) 
