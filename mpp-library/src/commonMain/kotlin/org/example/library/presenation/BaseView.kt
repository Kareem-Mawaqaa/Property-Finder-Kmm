package org.example.library.presenation

interface BaseView {

    fun onLoading(status: Boolean)

    fun onError(error: BaseError)

}