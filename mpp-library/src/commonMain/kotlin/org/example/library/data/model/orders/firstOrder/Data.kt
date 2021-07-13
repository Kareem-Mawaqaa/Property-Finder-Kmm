package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Data(
	@SerialName("aircrafttype")
	var aircrafttype : String? = null,
	@SerialName("ident")
	var ident : String? = null,
	@SerialName("origin")
	var origin : String? = null,
	@SerialName("arrivaltime")
	var arrivaltime : Int? = null,
	@SerialName("destination")
	var destination : String? = null,
	@SerialName("seats_cabin_first")
	var seats_cabin_first : Int? = null,
	@SerialName("seats_cabin_business")
	var seats_cabin_business : Int? = null,
	@SerialName("seats_cabin_coach")
	var seats_cabin_coach : Int? = null,
	@SerialName("actual_ident")
	var actual_ident : String? = null,
	@SerialName("meal_service")
	var meal_service : String? = null,
	@SerialName("departuretime")
	var departuretime : Int? = null,
) 
