package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Details(
	@SerialName("promise_date")
	var promise_date : String? = null,
	@SerialName("expected_date")
	var expected_date : String? = null,
	@SerialName("actual_date")
	var actual_date : Any? = null,
	@SerialName("delivery_type")
	var delivery_type : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("promise_time")
	var promise_time : String? = null,
	@SerialName("expected_time")
	var expected_time : String? = null,
	@SerialName("actual_time")
	var actual_time : Any? = null,
) 
