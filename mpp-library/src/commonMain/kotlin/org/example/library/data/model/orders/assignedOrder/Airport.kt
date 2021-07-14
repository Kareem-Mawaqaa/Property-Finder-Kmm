package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Airport(
	@SerialName("country")
	var country : String? = null,
	@SerialName("iata")
	var iata : String? = null,
	@SerialName("updated_at")
	var updated_at : String? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("icao")
	var icao : String? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("id")
	var id : Int? = null,
) 
