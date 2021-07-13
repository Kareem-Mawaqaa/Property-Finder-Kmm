package org.example.library.presenation.account.login

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import org.example.library.SharedFactory
import org.example.library.data.model.account.login.LoginRequest
import org.example.library.di.Instance
import org.example.library.domain.usecases.account.LoginUseCase
import org.example.library.presenation.BaseError
import org.example.library.presenation.BaseViewModel
import org.example.library.presenation.ErrorType

class LoginViewModel() : BaseViewModel<LoginView>() {

    private val muCurrentLogin = MutableLiveData(false)


    private val loginUseCase = Instance<LoginUseCase>()


    fun login(request: LoginRequest) {

        // TO Avoid Multiple Login when Deviec Rotate Screen
        if (muCurrentLogin.value) {
            view?.onLoading(true)
            return
        }

        muCurrentLogin.postValue(true)
        view?.onLoading(true)

        viewModelScope.launch {


            muCurrentLogin.postValue(false)
            loginUseCase.execute(request).onEach { dataState ->



                dataState.data?.let {

                    SharedFactory.factory?.keyValueStorage?.token = "Bearer ${it.token}"
                    view?.onLoading(false)
                    view?.onLoginSuccess(it)
                    view?.goToHomeScreen()

                }

                dataState.error?.let {
                    view?.onLoading(false)
                    view?.onError(BaseError(it, ErrorType.DIALOG, false))
                }


            }.stateIn(this)

        }
    }

    override fun onAttachView() {
        view?.onLoading(muCurrentLogin.value)
    }

    override fun onDeAttachView() {
        // Clear
//        onCleared()
    }


}