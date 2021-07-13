package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

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