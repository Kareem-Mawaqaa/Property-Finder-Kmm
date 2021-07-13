package org.example.library.data.model.search.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
) 