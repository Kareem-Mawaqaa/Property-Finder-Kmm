package org.example.library.data.model.org.example.library.updateOrder

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class UpdateOrderRequest(
	@SerializedName("receipt_at")
	@Expose
	var receipt_at : String? = null,
	@SerializedName("end_at")
	@Expose
	var end_at : String? = null,
	@SerializedName("qnt")
	@Expose
	var qnt : String? = null,
	@SerializedName("latitude")
	@Expose
	var latitude : String? = null,
	@SerializedName("service_size_price_id")
	@Expose
	var service_size_price_id : String? = null,
	@SerializedName("receipt_mobile")
	@Expose
	var receipt_mobile : String? = null,
	@SerializedName("order_id")
	@Expose
	var order_id : String? = null,
	@SerializedName("payment_method")
	@Expose
	var payment_method : String? = null,
	@SerializedName("longitude")
	@Expose
	var longitude : String? = null,
) 