package org.example.library.data.model.orders.assignedOrder

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class WrapperBag(

    @SerialName("passenger_name")
    val passenger_name: String? = "",
    @SerialName("bags")
    val bags: ArrayList<Bags>? = null,
    )