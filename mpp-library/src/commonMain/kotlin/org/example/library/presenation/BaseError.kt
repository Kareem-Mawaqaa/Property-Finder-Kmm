package org.example.library.presenation

data class BaseError(
    val message: String,
    val type: ErrorType,
    val canClose: Boolean = true
)

enum class ErrorType {
    DIALOG,
    TOAST,
    SNACKBAR
}