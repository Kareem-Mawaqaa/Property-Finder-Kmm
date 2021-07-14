package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Bags(
	@SerialName("image")
	var image : String? = null,
	@SerialName("condition")
	var condition : String? = null,
	@SerialName("size")
	var size : String? = null,
	@SerialName("ft_tag")
	var ft_tag : String? = null,
	@SerialName("price")
	var price : Double? = null,
	@SerialName("image_damaged")
	var image_damaged : String? = null,
	@SerialName("tag_number")
	var tag_number : String? = null,
	@SerialName("booking_reference")
	var booking_reference : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("order_id")
	var order_id : Int? = null,
	@SerialName("passenger_name")
	var passenger_name : String? = null,
	@SerialName("status")
	var status : String? = null,
) 
