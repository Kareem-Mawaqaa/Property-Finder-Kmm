package org.example.library.presenation.account.login

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.example.library.data.model.account.login.LoginRequest
import org.example.library.data.model.account.login.LoginResponse
import org.example.library.di.Instance
import org.example.library.domain.usecases.account.LoginUseCase
import org.example.library.presenation.BaseViewModel2
import org.example.library.presenation.ErrorViewState

class LoginViewModel : ViewModel() {


    public val viewState = MutableLiveData<LoginViewState>(LoginViewState())
    public val errorViewState = MutableLiveData<ErrorViewState>(ErrorViewState())

    val loginUseCase = Instance<LoginUseCase>()


    fun login(request: LoginRequest) {

        viewModelScope.launch {
            loginUseCase.execute(request).onEach { dataState ->

                dataState.data?.let {
                    viewState.postValue(LoginViewState(loginResponse = it))
                }

                dataState.error?.let {
                    errorViewState.postValue(ErrorViewState(it))
                }

            }.launchIn(this)
        }

    }


}