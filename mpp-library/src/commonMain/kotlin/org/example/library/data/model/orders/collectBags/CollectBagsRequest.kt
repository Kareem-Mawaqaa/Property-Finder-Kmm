package org.example.library.data.model.orders.collectBags


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CollectBagsRequest(
	@SerialName("bag_id")
	var bag_id : Int? = null,
	@SerialName("order_id")
	var order_id : Int? = null,
) 