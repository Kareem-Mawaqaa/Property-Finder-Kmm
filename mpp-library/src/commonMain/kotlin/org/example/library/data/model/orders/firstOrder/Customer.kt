package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Customer(
	@SerialName("last_name")
	var last_name : String? = null,
	@SerialName("phone_number")
	var phone_number : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("first_name")
	var first_name : String? = null,
	@SerialName("email")
	var email : String? = null,
	@SerialName("phone_prefix")
	var phone_prefix : String? = null,
) 
