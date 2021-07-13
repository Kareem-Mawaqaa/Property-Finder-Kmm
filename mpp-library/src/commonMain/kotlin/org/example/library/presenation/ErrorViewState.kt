package org.example.library.presenation

data class ErrorViewState(
    val error: String  = "",
    val type: ErrorType = ErrorType.DIALOG
)


