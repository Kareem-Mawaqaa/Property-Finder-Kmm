package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName

data class Statuses(
	@SerialName("updated_at")
	var updated_at : String? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("comment")
	var comment : Any? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("order_id")
	var order_id : Int? = null,
	@SerialName("status")
	var status : Int? = null,
) 
