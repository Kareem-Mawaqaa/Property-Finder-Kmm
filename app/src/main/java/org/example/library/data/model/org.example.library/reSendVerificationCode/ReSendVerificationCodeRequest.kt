package org.example.library.data.model.org.example.library.reSendVerificationCode

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class ReSendVerificationCodeRequest(
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
) 