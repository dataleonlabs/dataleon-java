package com.dataleon.api.errors

class DataleonInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : DataleonException(message, cause)
