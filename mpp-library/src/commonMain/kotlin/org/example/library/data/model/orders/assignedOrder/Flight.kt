package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName

data class Flight(
	@SerialName("flight_status")
	var flight_status : String? = null,
	@SerialName("flight_date")
	var flight_date : String? = null,
	@SerialName("data")
	var data : Data? = null,
	@SerialName("updated_at")
	var updated_at : String? = null,
	@SerialName("flight_number")
	var flight_number : String? = null,
	@SerialName("arrivaltime")
	var arrivaltime : String? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("id")
	var id : Int? = null,
) 
