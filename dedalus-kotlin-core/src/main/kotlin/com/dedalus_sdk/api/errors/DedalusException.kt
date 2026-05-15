package com.dedalus_sdk.api.errors

open class DedalusException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
