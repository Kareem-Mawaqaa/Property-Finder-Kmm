package org.example.library.presenation.home.orders

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.example.library.data.model.orders.collectedOrder.CollectedOrderResponse
import org.example.library.di.Instance
import org.example.library.domain.data.DataState
import org.example.library.domain.usecases.orders.CollectedOrderUseCase

data class OrdersViewState(
    val collectedOrderResponse: CollectedOrderResponse? = null,
)