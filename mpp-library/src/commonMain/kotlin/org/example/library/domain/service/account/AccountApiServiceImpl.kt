package org.example.library.domain.service.account


import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.library.data.account.forgetPassword.ForgetPasswordRequest
import org.example.library.data.account.forgetPassword.ForgetPasswordResponse
import org.example.library.data.account.login.LoginRequest
import org.example.library.data.account.login.LoginResponse
import org.example.library.di.ServiceLocatorInstance


class AccountApiServiceImpl() : AccountApiService {

    private val BASE_URL = "http://l7m.mawaqaademos.com/api"

    fun client() = ServiceLocatorInstance.provide(HttpClient::class)

    override suspend fun login(request: LoginRequest): LoginResponse {

        return client().post("$BASE_URL/Home/Login") {
            contentType(ContentType.Application.Json)
            body = request
        }

    }

    override suspend fun forgetPassword(request: ForgetPasswordRequest): ForgetPasswordResponse {
        return client().post("$BASE_URL/Home/Forget") {
            contentType(ContentType.Application.Json)
            body = request
        }
    }

}