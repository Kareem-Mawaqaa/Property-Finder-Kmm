package org.example.library.data.account.login

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(

        @SerialName("APIKey")
        val APIKey: String? = null,

        @SerialName("APIMessage")
        val APIMessage: String? = null,

        @SerialName("APIStatus")
        val APIStatus: Int? = null,

        @SerialName("APIToken")
        val APIToken: String? = null,

        @SerialName("LanguageID")
        val LanguageID: Int? = null,

        @SerialName("PageID")
        val PageID: Int? = null,

        @SerialName("PageSize")
        val PageSize: Int? = null,

        @SerialName("UserID")
        val UserID: Int? = null,

        @SerialName("oCustomer")
        val oCustomer: OCustomer? = null

        )
{
        override fun toString(): String {
                return "LoginResponse(APIKey='$APIKey', APIMessage=$APIMessage, APIStatus='$APIStatus', APIToken='$APIToken', LanguageID='$LanguageID', PageID='$PageID', PageSize=$PageSize, UserID='$UserID', oCustomer='$oCustomer')"
        }
}
