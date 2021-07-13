package org.example.library.data.model.org.example.library.searchOrFilterServices

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

//@Parcelize
data class SearchOrFilterServicesRequest(
	@SerializedName("keywords")
	@Expose
	var keywords : String? = null,
	@SerializedName("classifications_id")
	@Expose
	var classifications_id : String? = null,
	@SerializedName("city_id")
	@Expose
	var city_id : String? = null,
) 