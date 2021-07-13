package org.example.library.presenation.account.login

import org.example.library.data.model.account.login.LoginResponse

 data class LoginViewState(
    var loginResponse: LoginResponse? = null,
){


    fun refreshViewState(state: LoginViewState){

    }
}