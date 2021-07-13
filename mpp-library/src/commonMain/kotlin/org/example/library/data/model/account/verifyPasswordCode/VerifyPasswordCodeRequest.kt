package org.example.library.data.model.account.verifyPasswordCode


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VerifyPasswordCodeRequest(
	@SerialName("code")
	var code : String? = null,
) 