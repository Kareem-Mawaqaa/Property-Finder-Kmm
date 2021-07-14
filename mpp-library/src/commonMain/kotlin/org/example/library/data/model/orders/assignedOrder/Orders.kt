package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Orders(
	@SerialName("convert_bags_larg")
	var convert_bags_larg : Int? = null,
	@SerialName("flight")
	var flight : Flight? = null,
	@SerialName("number_order")
	var number_order : String? = null,
	@SerialName("belt")
	var belt : Belt? = null,
	@SerialName("bags")
	var bags : ArrayList<WrapperBag>? = null,
	@SerialName("created_at")
	var created_at : String? = null,
	@SerialName("addresse")
	var addresse : Addresse? = null,
	@SerialName("terminal")
	var terminal : Terminal? = null,
	@SerialName("refend")
	var refend : Double? = null,
	@SerialName("airport")
	var airport : Airport? = null,
	@SerialName("vehicle")
	var vehicle : Vehicle? = null,
	@SerialName("rate")
	var rate : Int? = null,
	@SerialName("subtotal")
	var subtotal : Double? = null,
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
	var grand_total : Double? = null,
	@SerialName("payment_method")
	var payment_method : String? = null,
	@SerialName("porter")
	var porter : Porter? = null,
	@SerialName("status")
	var status : String? = null,
	@SerialName("customer")
	var customer : Customer? = null,
) 


@Serializable
class KAny()  {

}