package org.example.library.data.model.org.example.library.checkPromoCode

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class CheckPromoCodeRequest(
	@SerializedName("code")
	@Expose
	var code : String? = null,
) 