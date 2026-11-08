package com.nexora.common

sealed interface OperationResult<out T> {
    data class Success<T>(val data: T) : OperationResult<T>
    data class Failure(val code: String, val message: String) : OperationResult<Nothing>
    data class Unsupported(val reason: String) : OperationResult<Nothing>
    data object PermissionRequired : OperationResult<Nothing>
}
