package org.example.library.data.model.org.example.library.evaluateOrder

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class EvaluateOrderRequest(
	@SerializedName("notes")
	@Expose
	var notes : String? = null,
	@SerializedName("evaluations")
	@Expose
	var evaluations : ArrayList<Evaluations>? = null,
	@SerializedName("order_id")
	@Expose
	var order_id : Int? = null,
) 