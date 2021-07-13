package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Belt(
	@SerialName("is_active")
	var is_active : Int? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("id")
	var id : Int? = null,
) 
