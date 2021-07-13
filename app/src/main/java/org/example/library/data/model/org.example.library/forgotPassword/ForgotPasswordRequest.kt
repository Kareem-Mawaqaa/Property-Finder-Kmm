package org.example.library.data.model.org.example.library.forgotPassword

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class ForgotPasswordRequest(
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
) 