package org.example.library.data.account.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OCustomer(
        @SerialName("DeviceID")
    val DeviceID: String? = null,

        @SerialName("DevicePlatform")
    val DevicePlatform: Int? = null,

        @SerialName("DeviceToken")
    val DeviceToken: String? = null,

        @SerialName("Email")
    val Email: String? = null,

        @SerialName("Password")
    val Password: String? = null
)