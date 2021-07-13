package org.example.library.data.model.org.example.library.cancelOrder

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class CancelOrderRequest(
	@SerializedName("order_id")
	@Expose
	var order_id : String? = null,
) 