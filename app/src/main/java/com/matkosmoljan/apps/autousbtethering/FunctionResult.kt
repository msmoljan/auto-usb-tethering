package com.matkosmoljan.apps.autousbtethering


sealed class FunctionResult<out T> {
    class Success<T>(val value: T) : FunctionResult<T>()
    class Failure<T>(val exception: Throwable) : FunctionResult<T>()
}

fun <T> FunctionResult<T>.fold(
    onSuccess: (T) -> Unit,
    onFailure: (Throwable) -> Unit
) = when (this) {
    is FunctionResult.Success -> onSuccess(value)
    is FunctionResult.Failure -> onFailure(exception)
}