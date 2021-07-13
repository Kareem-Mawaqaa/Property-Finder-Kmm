package org.example.library.data.model.org.example.library.verifyEmail

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class VerifyEmailRequest(
	@SerializedName("verification_code")
	@Expose
	var verification_code : String? = null,
) 