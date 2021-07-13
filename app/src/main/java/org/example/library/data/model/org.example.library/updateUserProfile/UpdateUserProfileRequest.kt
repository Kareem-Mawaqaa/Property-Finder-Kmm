package org.example.library.data.model.org.example.library.updateUserProfile

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class UpdateUserProfileRequest(
	@SerializedName("old_password")
	@Expose
	var old_password : String? = null,
	@SerializedName("password")
	@Expose
	var password : String? = null,
	@SerializedName("password_confirmation")
	@Expose
	var password_confirmation : String? = null,
	@SerializedName("latitude")
	@Expose
	var latitude : String? = null,
	@SerializedName("name")
	@Expose
	var name : String? = null,
	@SerializedName("mobile")
	@Expose
	var mobile : String? = null,
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