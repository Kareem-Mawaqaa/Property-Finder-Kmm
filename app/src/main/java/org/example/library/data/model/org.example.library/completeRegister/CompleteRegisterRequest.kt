package org.example.library.data.model.org.example.library.completeRegister

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class CompleteRegisterRequest(
	@SerializedName("password")
	@Expose
	var password : String? = null,
	@SerializedName("password_confirmation")
	@Expose
	var password_confirmation : String? = null,
) 