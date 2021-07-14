package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Belt(
	@SerialName("is_active")
	var is_active : Int? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("id")
	var id : Int? = null,
) 
