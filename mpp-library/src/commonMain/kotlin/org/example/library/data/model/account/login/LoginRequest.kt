package org.example.library.data.model.account.login


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
	@SerialName("password")
	var password : String? = null,
	@SerialName("user_name")
	var user_name : String? = null,
) 