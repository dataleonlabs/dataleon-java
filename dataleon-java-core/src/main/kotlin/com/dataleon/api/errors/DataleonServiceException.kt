// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.errors

import com.dataleon.api.core.JsonValue
import com.dataleon.api.core.http.Headers

abstract class DataleonServiceException
protected constructor(message: String, cause: Throwable? = null) :
    DataleonException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
