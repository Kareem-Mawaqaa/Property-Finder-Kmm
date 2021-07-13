package org.example.library.presenation

import dev.icerock.moko.mvvm.viewmodel.ViewModel

abstract class BaseViewModel2<T> : ViewModel() {

    protected var view: T? = null

    fun attachViewState(view: T) {
        this.view = view
        onAttachView()
    }

    fun deAttachView() {
        this.view = null
        onDeAttachView()
    }

    abstract fun onAttachView()

    abstract fun onDeAttachView()


}