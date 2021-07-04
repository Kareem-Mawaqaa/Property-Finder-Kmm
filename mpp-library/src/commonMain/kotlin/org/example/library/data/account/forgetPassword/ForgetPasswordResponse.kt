package org.example.library.data.account.forgetPassword

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForgetPasswordResponse(
    @SerialName("APIMessage")
    val message: String,
)