package org.example.library.data.account.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginRequest(
    @SerialName("APIKey")
    val APIKey: String,

    @SerialName("LanguageID")
    val LanguageID: Int,

    @SerialName("oCustomer")
    val oCustomer: OCustomer,

  /*      @SerializedName("password")
        @Expose
    val password: String,

        @SerializedName("email")
        @Expose
    val username: String*/
)
{
    override fun toString(): String {
        return "LoginRequest(APIKey='$APIKey', LanguageID='$LanguageID', oCustomer='$oCustomer')"
    }
}