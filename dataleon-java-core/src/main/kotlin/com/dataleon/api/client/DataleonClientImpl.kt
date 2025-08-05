// File generated from our OpenAPI spec by Stainless.

package com.dataleon.api.client

import com.dataleon.api.core.ClientOptions
import com.dataleon.api.core.getPackageVersion
import com.dataleon.api.services.blocking.CompanyService
import com.dataleon.api.services.blocking.CompanyServiceImpl
import com.dataleon.api.services.blocking.IndividualService
import com.dataleon.api.services.blocking.IndividualServiceImpl
import java.util.function.Consumer

class DataleonClientImpl(private val clientOptions: ClientOptions) : DataleonClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: DataleonClientAsync by lazy { DataleonClientAsyncImpl(clientOptions) }

    private val withRawResponse: DataleonClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val individuals: IndividualService by lazy {
        IndividualServiceImpl(clientOptionsWithUserAgent)
    }

    private val companies: CompanyService by lazy { CompanyServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): DataleonClientAsync = async

    override fun withRawResponse(): DataleonClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataleonClient =
        DataleonClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun individuals(): IndividualService = individuals

    override fun companies(): CompanyService = companies

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataleonClient.WithRawResponse {

        private val individuals: IndividualService.WithRawResponse by lazy {
            IndividualServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyService.WithRawResponse by lazy {
            CompanyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataleonClient.WithRawResponse =
            DataleonClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun individuals(): IndividualService.WithRawResponse = individuals

        override fun companies(): CompanyService.WithRawResponse = companies
    }
}
