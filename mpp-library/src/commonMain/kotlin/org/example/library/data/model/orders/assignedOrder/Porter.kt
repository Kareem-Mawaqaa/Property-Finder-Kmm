package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Porter(
	@SerialName("closed_at")
	var closed_at : String? = null,
	@SerialName("time_from")
	var time_from : String? = null,
	@SerialName("porter_name")
	var porter_name : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("date_from")
	var date_from : String? = null,
) 
