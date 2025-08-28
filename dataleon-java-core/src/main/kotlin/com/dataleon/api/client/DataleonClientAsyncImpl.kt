// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.client

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.getPackageVersion
import com.dataleon.api.services.async.CompanyServiceAsync
import com.dataleon.api.services.async.CompanyServiceAsyncImpl
import com.dataleon.api.services.async.IndividualServiceAsync
import com.dataleon.api.services.async.IndividualServiceAsyncImpl
import java.util.function.Consumer

class DataleonClientAsyncImpl(private val clientOptions: ClientOptions) : DataleonClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: DataleonClient by lazy { DataleonClientImpl(clientOptions) }

    private val withRawResponse: DataleonClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val individuals: IndividualServiceAsync by lazy {
        IndividualServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val companies: CompanyServiceAsync by lazy {
        CompanyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): DataleonClient = sync

    override fun withRawResponse(): DataleonClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataleonClientAsync =
        DataleonClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun individuals(): IndividualServiceAsync = individuals

    override fun companies(): CompanyServiceAsync = companies

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataleonClientAsync.WithRawResponse {

        private val individuals: IndividualServiceAsync.WithRawResponse by lazy {
            IndividualServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataleonClientAsync.WithRawResponse =
            DataleonClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun individuals(): IndividualServiceAsync.WithRawResponse = individuals

        override fun companies(): CompanyServiceAsync.WithRawResponse = companies
    }
}
