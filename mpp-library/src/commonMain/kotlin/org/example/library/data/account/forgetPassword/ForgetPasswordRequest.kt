package org.example.library.data.account.forgetPassword

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForgetPasswordRequest(
    @SerialName("email")
    val email: String,
)