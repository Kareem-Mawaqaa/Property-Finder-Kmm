package org.example.library.data.model.org.example.library.register

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class RegisterRequest(
	@SerializedName("device_id")
	@Expose
	var device_id : String? = null,
	@SerializedName("latitude")
	@Expose
	var latitude : String? = null,
	@SerializedName("name")
	@Expose
	var name : String? = null,
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
	@SerializedName("address_details")
	@Expose
	var address_details : String? = null,
	@SerializedName("device_type")
	@Expose
	var device_type : String? = null,
	@SerializedName("firebase_token")
	@Expose
	var firebase_token : String? = null,
	@SerializedName("email")
	@Expose
	var email : String? = null,
	@SerializedName("country_id")
	@Expose
	var country_id : String? = null,
	@SerializedName("city_id")
	@Expose
	var city_id : String? = null,
	@SerializedName("longitude")
	@Expose
	var longitude : String? = null,
) 