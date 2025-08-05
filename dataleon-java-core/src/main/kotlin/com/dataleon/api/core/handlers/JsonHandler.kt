@file:JvmName("JsonHandler")

package com.dataleon.api.core.handlers

import com.dataleon.api.core.http.HttpResponse
import com.dataleon.api.core.http.HttpResponse.Handler
import com.dataleon.api.errors.DataleonInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw DataleonInvalidDataException("Error reading response", e)
            }
    }
