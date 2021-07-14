package org.example.library.domain.services.account

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.library.di.ServiceLocatorInstance
import org.example.library.data.model.account.login.LoginResponse
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeResponse
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeResponse
import org.example.library.data.model.account.changePassword.ChangePasswordResponse         
import org.example.library.data.model.account.login.LoginRequest
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeRequest
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeRequest
import org.example.library.data.model.account.changePassword.ChangePasswordRequest
        
class AccountApiServiceImpl :  AccountApiService {

    private val BASE_URL = "http://flythru.phpmawaqaa.com/api"

    fun client() = ServiceLocatorInstance.provide(HttpClient::class)
    
        
    override suspend fun login(request: LoginRequest): LoginResponse  {
         return client().post("$BASE_URL/porter/auth/login") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun sendPasswordCode(request: SendPasswordCodeRequest): SendPasswordCodeResponse  {
         return client().post("$BASE_URL/porter/auth/send_password_code") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun verifyPasswordCode(request: VerifyPasswordCodeRequest): VerifyPasswordCodeResponse  {
         return client().post("$BASE_URL/porter/auth/verify_password_code") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

	
        
    override suspend fun changePassword(request: ChangePasswordRequest): ChangePasswordResponse  {
         return client().post("$BASE_URL/porter/auth/changepassword") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

   
}
