package org.example.library.presenation.home.orders

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.example.library.di.Instance
import org.example.library.domain.data.DataState
import org.example.library.domain.usecases.orders.CollectedOrderUseCase

class OrdersViewModel : ViewModel() {

    val viewState = MutableLiveData<DataState<OrdersViewState>>(DataState())

    private val orderUseCase = Instance<CollectedOrderUseCase>()

    init {
        getOrders()
    }

    private fun getOrders() {

        viewState.postValue(DataState.loading())
        viewModelScope.launch {

            orderUseCase.execute().onEach { dataState ->

                dataState.error?.let {
                    viewState.postValue(DataState(loading = false))

                }

                dataState.data?.let {
                    viewState.postValue(DataState(loading = false))

                    if (it.status == "success") {
                        viewState.postValue(DataState.success(OrdersViewState(collectedOrderResponse = it)))
                    } else {
                        viewState.postValue(DataState.error(it.message ?: "Error "))
                    }

                }

            }.launchIn(this)
        }

    }
}