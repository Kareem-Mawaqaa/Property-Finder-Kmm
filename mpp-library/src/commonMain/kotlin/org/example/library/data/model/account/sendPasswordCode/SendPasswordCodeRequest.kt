package org.example.library.data.model.account.sendPasswordCode


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SendPasswordCodeRequest(
	@SerialName("user_name")
	var user_name : String? = null,
	@SerialName("phone_number")
	var phone_number : String? = null,
) 