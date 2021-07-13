package org.example.library.data.model.search.search


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchRequest(
	@SerialName("number_order")
	var number_order : Int? = null,
) 