package org.example.library.data.model.org.example.library.login

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class LoginRequest(
	@SerializedName("password")
	@Expose
	var password : String? = null,
	@SerializedName("device_id")
	@Expose
	var device_id : String? = null,
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
	@SerializedName("device_type")
	@Expose
	var device_type : String? = null,
	@SerializedName("firebase_token")
	@Expose
	var firebase_token : String? = null,
) 