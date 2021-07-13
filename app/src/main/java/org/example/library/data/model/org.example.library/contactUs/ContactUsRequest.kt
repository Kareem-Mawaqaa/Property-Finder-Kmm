package org.example.library.data.model.org.example.library.contactUs

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class ContactUsRequest(
	@SerializedName("subject")
	@Expose
	var subject : String? = null,
	@SerializedName("message")
	@Expose
	var message : String? = null,
) 