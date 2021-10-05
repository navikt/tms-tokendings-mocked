package no.nav.tms.tokendings.mock.exchange

import io.ktor.application.*
import kotlinx.serialization.SerialName

object TokendingsMetadataBuilder {
    fun createMetadata(call: ApplicationCall): TokendingsConfigurationMetadata {
        val scheme = call.request.local.scheme
        val host = call.request.local.host
        val port = call.request.local.port

        val url = "$scheme://$host:$port/token"

        return TokendingsConfigurationMetadata(url)
    }
}

data class TokendingsConfigurationMetadata(
        @SerialName("token_endpoint") val tokenEndpoint: String,
        @SerialName("issuer") val issuer: String = "", //TODO
        @SerialName("jwks_uri") val jwksUri: String = "" //TODO
)
