package org.example.library.data.model.org.example.library.checkForgotPasswordCode

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class CheckForgotPasswordCodeRequest(
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
	@SerializedName("verification_code")
	@Expose
	var verification_code : String? = null,
) 