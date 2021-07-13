package org.example.library.data.model.account.changePassword


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChangePasswordRequest(
	@SerialName("password")
	var password : String? = null,
	@SerialName("password_confirmation")
	var password_confirmation : String? = null,
) 