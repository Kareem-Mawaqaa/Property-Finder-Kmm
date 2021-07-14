package org.example.library.presenation.account.login

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.example.library.KeyValueStorage
import org.example.library.data.model.account.login.LoginRequest
import org.example.library.data.model.account.login.LoginResponse
import org.example.library.di.Instance
import org.example.library.di.ServiceLocatorInstance
import org.example.library.domain.data.DataState
import org.example.library.domain.usecases.account.LoginUseCase
import org.example.library.presenation.BaseViewModel2
import org.example.library.presenation.ErrorViewState

class LoginViewModel : ViewModel() {


    public val viewState = MutableLiveData<LoginViewState>(LoginViewState())
    public val viewState2 = MutableLiveData<DataState<LoginViewState>>(DataState())
    public val errorViewState = MutableLiveData<ErrorViewState>(ErrorViewState())

    val loginUseCase = Instance<LoginUseCase>()


    fun login(request: LoginRequest) {

        viewState2.postValue(DataState.loading())
        viewModelScope.launch {
            loginUseCase.execute(request).onEach { dataState ->

                viewState2.postValue(DataState(loading = false))

                dataState.data?.let {
                    if (it.status == "success") {
                        ServiceLocatorInstance.provide(KeyValueStorage::class).token = it.token
                        viewState2.postValue(DataState.success(LoginViewState(loginResponse = it)))
                    } else {
                        viewState2.postValue(DataState.error(it.message ?: "Unknown Error"))
                    }
                }

                dataState.error?.let {
                    viewState2.postValue(DataState.error(it))
                }

            }.launchIn(this)
        }

    }


}