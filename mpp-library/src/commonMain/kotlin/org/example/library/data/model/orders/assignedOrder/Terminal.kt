package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Terminal(
	@SerialName("airport_id")
	var airport_id : Int? = null,
	@SerialName("updated_at")
	var updated_at : String? = null,
	@SerialName("name")
	var name : String? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("deleted_at")
	var deleted_at : String? = null,
) 
