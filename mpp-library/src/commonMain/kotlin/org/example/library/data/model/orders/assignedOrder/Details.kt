package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Details(
	@SerialName("promise_date")
	var promise_date : String? = null,
	@SerialName("expected_date")
	var expected_date : String? = null,
	@SerialName("actual_date")
	var actual_date : String? = null,
	@SerialName("delivery_type")
	var delivery_type : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("promise_time")
	var promise_time : String? = null,
	@SerialName("expected_time")
	var expected_time : String? = null,
	@SerialName("actual_time")
	var actual_time : String? = null,
) 
