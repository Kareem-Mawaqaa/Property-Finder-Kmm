package org.example.library.presenation.account.login

import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import org.example.library.SharedFactory
import org.example.library.data.account.login.LoginRequest
import org.example.library.di.Instance
import org.example.library.domain.service.account.AccountApiServiceImpl
import org.example.library.domain.usecases.account.LoginUsecase
import org.example.library.domain.usecases.account.RegisterUsecase
import org.example.library.presenation.BaseError
import org.example.library.presenation.BaseView
import org.example.library.presenation.BaseViewModel
import org.example.library.presenation.ErrorType
import kotlin.math.log

class LoginViewModel() : BaseViewModel<LoginView>() {

    private val muCurrentLogin = MutableLiveData(false)



    private val loginUsecase: LoginUsecase = Instance()
    private val registerUsecase: RegisterUsecase = Instance()



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
            loginUsecase.execute(request).onEach { dataState ->

                view?.onLoading(false)

                dataState.data?.let {
                    view?.onLoginSuccess(it)
                    view?.goToHomeScreen()

                }

                dataState.error?.let {
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