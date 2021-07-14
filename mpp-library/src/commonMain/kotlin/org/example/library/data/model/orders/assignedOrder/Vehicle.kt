package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Vehicle(
	@SerialName("driver")
	var driver : Driver? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("plate_number")
	var plate_number : String? = null,
	@SerialName("capacity")
	var capacity : Int? = null,
) 
