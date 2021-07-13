package org.example.library.di.runner

import org.example.library.di.ServiceLocator
import org.example.library.di.Instance
import org.example.library.domain.services.account.*
import org.example.library.domain.services.orders.*
import org.example.library.domain.usecases.account.LoginUseCase
import org.example.library.domain.usecases.account.SendPasswordCodeUseCase
import org.example.library.domain.usecases.account.VerifyPasswordCodeUseCase
import org.example.library.domain.usecases.account.ChangePasswordUseCase
import org.example.library.domain.usecases.orders.GetCancellationReasonsUseCase
import org.example.library.domain.usecases.orders.InJourneyUseCase
import org.example.library.domain.usecases.orders.FirstOrderUseCase
import org.example.library.domain.usecases.orders.AddSignatureUseCase
import org.example.library.domain.usecases.orders.CancelOrderUseCase
import org.example.library.domain.usecases.orders.ConfirmOrderUseCase
import org.example.library.domain.usecases.orders.CompletedJourneyUseCase



fun Runner(locator: ServiceLocator) {

    locator.register(AccountApiService::class, lazy { AccountApiServiceImpl() })
	locator.register(OrdersApiService::class, lazy { OrdersApiServiceImpl() })
    
    
    locator.register(LoginUseCase::class , LoginUseCase(Instance()))
	locator.register(SendPasswordCodeUseCase::class , SendPasswordCodeUseCase(Instance()))
	locator.register(VerifyPasswordCodeUseCase::class , VerifyPasswordCodeUseCase(Instance()))
	locator.register(ChangePasswordUseCase::class , ChangePasswordUseCase(Instance()))
    locator.register(GetCancellationReasonsUseCase::class , GetCancellationReasonsUseCase(Instance()))
	locator.register(InJourneyUseCase::class , InJourneyUseCase(Instance()))
	locator.register(FirstOrderUseCase::class , FirstOrderUseCase(Instance()))
	locator.register(AddSignatureUseCase::class , AddSignatureUseCase(Instance()))
	locator.register(CancelOrderUseCase::class , CancelOrderUseCase(Instance()))
	locator.register(ConfirmOrderUseCase::class , ConfirmOrderUseCase(Instance()))
	locator.register(CompletedJourneyUseCase::class , CompletedJourneyUseCase(Instance()))

}
