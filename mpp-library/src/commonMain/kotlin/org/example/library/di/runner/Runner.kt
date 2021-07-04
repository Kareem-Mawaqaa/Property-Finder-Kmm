package org.example.library.di.runner

import org.example.library.di.ServiceLocator
import org.example.library.di.Instance
import org.example.library.domain.usecases.account.ForgetPasswordUseCase
import org.example.library.domain.usecases.account.LoginUsecase
import org.example.library.domain.usecases.account.RegisterUsecase


fun Runner(locator: ServiceLocator) {
    locator.register(ForgetPasswordUseCase::class, lazy { ForgetPasswordUseCase(Instance()) })
    locator.register(LoginUsecase::class, lazy { LoginUsecase(Instance()) })
    locator.register(RegisterUsecase::class, lazy { RegisterUsecase(Instance()) })

}

