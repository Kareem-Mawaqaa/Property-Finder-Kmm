package org.example.library.data.model.orders.firstOrder

import kotlinx.serialization.SerialName

data class Order(
	@SerialName("convert_bags_larg")
	var convert_bags_larg : Double? = null,
	@SerialName("flight")
	var flight : Flight? = null,
	@SerialName("number_order")
	var number_order : String? = null,
	@SerialName("belt")
	var belt : Belt? = null,
	@SerialName("bags")
	var bags : ArrayList<Bags>? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("addresse")
	var addresse : Addresse? = null,
	@SerialName("terminal")
	var terminal : Terminal? = null,
	@SerialName("refend")
	var refend : Any? = null,
	@SerialName("airport")
	var airport : Airport? = null,
	@SerialName("vehicle")
	var vehicle : Vehicle? = null,
	@SerialName("rate")
	var rate : Int? = null,
	@SerialName("subtotal")
	var subtotal : Int? = null,
	@SerialName("number_of_bags")
	var number_of_bags : Int? = null,
	@SerialName("actual_bags")
	var actual_bags : Int? = null,
	@SerialName("statuses")
	var statuses : ArrayList<Statuses>? = null,
	@SerialName("details")
	var details : Details? = null,
	@SerialName("id")
	var id : Int? = null,
	@SerialName("grand_total")
	var grand_total : Int? = null,
	@SerialName("payment_method")
	var payment_method : String? = null,
	@SerialName("porter")
	var porter : Porter? = null,
	@SerialName("status")
	var status : String? = null,
	@SerialName("customer")
	var customer : Customer? = null,
) 
