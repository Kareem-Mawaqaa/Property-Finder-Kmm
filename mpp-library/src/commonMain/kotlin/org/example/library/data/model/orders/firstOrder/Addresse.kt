package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Addresse(
	@SerialName("area")
	var area : String? = null,
	@SerialName("office_number")
	var office_number : Any? = null,
	@SerialName("apartment_number")
	var apartment_number : Any? = null,
	@SerialName("instructions")
	var instructions : Any? = null,
	@SerialName("address_type")
	var address_type : Int? = null,
	@SerialName("lat_long")
	var lat_long : ArrayList<String>? = null,
	@SerialName("block_number")
	var block_number : String? = null,
	@SerialName("room_number")
	var room_number : Any? = null,
	@SerialName("floor_number")
	var floor_number : Any? = null,
	@SerialName("house_number")
	var house_number : String? = null,
	@SerialName("address_name")
	var address_name : String? = null,
	@SerialName("area_id")
	var area_id : Int? = null,
	@SerialName("is_default")
	var is_default : Int? = null,
	@SerialName("avenue_number")
	var avenue_number : String? = null,
	@SerialName("hotel_name")
	var hotel_name : Any? = null,
	@SerialName("extra_info")
	var extra_info : Any? = null,
	@SerialName("additional_info")
	var additional_info : Any? = null,
	@SerialName("street")
	var street : String? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("building_number")
	var building_number : Any? = null,
) 
