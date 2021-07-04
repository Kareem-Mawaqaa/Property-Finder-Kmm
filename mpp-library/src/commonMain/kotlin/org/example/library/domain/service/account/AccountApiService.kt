package org.example.library.domain.service.account

import org.example.library.data.account.forgetPassword.ForgetPasswordRequest
import org.example.library.data.account.forgetPassword.ForgetPasswordResponse
import org.example.library.data.account.login.LoginRequest
import org.example.library.data.account.login.LoginResponse



interface AccountApiService {

    suspend fun login(request: LoginRequest): LoginResponse

    suspend fun forgetPassword(request: ForgetPasswordRequest) : ForgetPasswordResponse
}