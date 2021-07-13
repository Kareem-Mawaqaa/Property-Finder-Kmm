package org.example.library.data.model.account.changePassword

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChangePasswordResponse(
	@SerialName("api_status")
	var api_status : Int? = null,
	@SerialName("message")
	var message : String? = null,
	@SerialName("status")
	var status : String? = null,
	@SerialName("token")
	var token : String? = null,
) 