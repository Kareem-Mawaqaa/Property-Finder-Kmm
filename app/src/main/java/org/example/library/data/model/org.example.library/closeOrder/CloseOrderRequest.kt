package org.example.library.data.model.org.example.library.closeOrder

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class CloseOrderRequest(
	@SerializedName("total_money_received")
	@Expose
	var total_money_received : String? = null,
	@SerializedName("previous_container_photo")
	@Expose
	var previous_container_photo : String? = null,
	@SerializedName("new_container_number")
	@Expose
	var new_container_number : String? = null,
	@SerializedName("ticket_number")
	@Expose
	var ticket_number : String? = null,
	@SerializedName("previous_container_number")
	@Expose
	var previous_container_number : String? = null,
	@SerializedName("order_id")
	@Expose
	var order_id : String? = null,
) 