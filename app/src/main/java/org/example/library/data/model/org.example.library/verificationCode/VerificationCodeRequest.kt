package org.example.library.data.model.org.example.library.verificationCode

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class VerificationCodeRequest(
	@SerializedName("verification_code")
	@Expose
	var verification_code : String? = null,
) 