package org.example.library.di.runner

import org.example.library.di.ServiceLocator
import org.example.library.di.Instance
import org.example.library.domain.services.account.*
import org.example.library.domain.services.orders.*
import org.example.library.domain.services.search.*
import org.example.library.domain.usecases.account.LoginUseCase
import org.example.library.domain.usecases.account.SendPasswordCodeUseCase
import org.example.library.domain.usecases.account.VerifyPasswordCodeUseCase
import org.example.library.domain.usecases.account.ChangePasswordUseCase
import org.example.library.domain.usecases.orders.AssignedOrderUseCase
import org.example.library.domain.usecases.orders.OrderDetailsUseCase
import org.example.library.domain.usecases.orders.CollectBagsUseCase
import org.example.library.domain.usecases.orders.ConfirmOrderUseCase
import org.example.library.domain.usecases.orders.CollectedOrderUseCase
import org.example.library.domain.usecases.search.SearchUseCase



fun Runner(locator: ServiceLocator) {

    locator.register(AccountApiService::class, lazy { AccountApiServiceImpl() })
	locator.register(OrdersApiService::class, lazy { OrdersApiServiceImpl() })
	locator.register(SearchApiService::class, lazy { SearchApiServiceImpl() })
    
    
    locator.register(LoginUseCase::class , LoginUseCase(Instance()))
	locator.register(SendPasswordCodeUseCase::class , SendPasswordCodeUseCase(Instance()))
	locator.register(VerifyPasswordCodeUseCase::class , VerifyPasswordCodeUseCase(Instance()))
	locator.register(ChangePasswordUseCase::class , ChangePasswordUseCase(Instance()))
locator.register(AssignedOrderUseCase::class , AssignedOrderUseCase(Instance()))
	locator.register(OrderDetailsUseCase::class , OrderDetailsUseCase(Instance()))
	locator.register(CollectBagsUseCase::class , CollectBagsUseCase(Instance()))
	locator.register(ConfirmOrderUseCase::class , ConfirmOrderUseCase(Instance()))
	locator.register(CollectedOrderUseCase::class , CollectedOrderUseCase(Instance()))
locator.register(SearchUseCase::class , SearchUseCase(Instance()))

}
