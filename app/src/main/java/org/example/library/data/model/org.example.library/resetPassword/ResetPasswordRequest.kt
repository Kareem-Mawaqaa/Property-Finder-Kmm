package org.example.library.data.model.org.example.library.resetPassword

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class ResetPasswordRequest(
	@SerializedName("password")
	@Expose
	var password : String? = null,
	@SerializedName("password_confirmation")
	@Expose
	var password_confirmation : String? = null,
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
	@SerializedName("verification_code")
	@Expose
	var verification_code : String? = null,
) 