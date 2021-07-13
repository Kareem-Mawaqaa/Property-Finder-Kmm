package org.example.library.domain.services.account

import org.example.library.data.model.account.login.LoginResponse
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeResponse
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeResponse
import org.example.library.data.model.account.changePassword.ChangePasswordResponse         
import org.example.library.data.model.account.login.LoginRequest
import org.example.library.data.model.account.sendPasswordCode.SendPasswordCodeRequest
import org.example.library.data.model.account.verifyPasswordCode.VerifyPasswordCodeRequest
import org.example.library.data.model.account.changePassword.ChangePasswordRequest
        
interface AccountApiService {

    suspend fun login(request: LoginRequest): LoginResponse
	suspend fun sendPasswordCode(request: SendPasswordCodeRequest): SendPasswordCodeResponse
	suspend fun verifyPasswordCode(request: VerifyPasswordCodeRequest): VerifyPasswordCodeResponse
	suspend fun changePassword(request: ChangePasswordRequest): ChangePasswordResponse
   
}
            
