package org.example.library.data.model.org.example.library.sendVerifyEmail

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class SendVerifyEmailRequest(
	@SerializedName("email")
	@Expose
	var email : String? = null,
) 