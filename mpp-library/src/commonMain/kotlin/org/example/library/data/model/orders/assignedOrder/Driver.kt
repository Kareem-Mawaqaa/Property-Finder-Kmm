package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Driver(
	@SerialName("nationality")
	var nationality : String? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("phone_number")
	var phone_number : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("age")
	var age : Int? = null,
	@SerialName("license_number")
	var license_number : String? = null,
) 
