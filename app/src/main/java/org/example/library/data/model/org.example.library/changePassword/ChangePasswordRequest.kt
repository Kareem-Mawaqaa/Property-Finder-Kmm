package org.example.library.data.model.org.example.library.changePassword

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class ChangePasswordRequest(
	@SerializedName("old_password")
	@Expose
	var old_password : String? = null,
	@SerializedName("password")
	@Expose
	var password : String? = null,
	@SerializedName("password_confirmation")
	@Expose
	var password_confirmation : String? = null,
) 