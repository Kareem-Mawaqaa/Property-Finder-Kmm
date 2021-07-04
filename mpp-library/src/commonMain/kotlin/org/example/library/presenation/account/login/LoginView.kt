package org.example.library.presenation.account.login

import org.example.library.data.account.login.LoginResponse
import org.example.library.presenation.BaseView

interface LoginView : BaseView {

    fun onLoginSuccess(response: LoginResponse)

}