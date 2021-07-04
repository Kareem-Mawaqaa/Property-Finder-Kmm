package org.example.library.domain.usecases.account

import org.example.library.domain.service.account.AccountApiService

class RegisterUsecase(private val service: AccountApiService) {

    suspend fun execute(reqeust: Any): String {
        return "dsa "
    }
}