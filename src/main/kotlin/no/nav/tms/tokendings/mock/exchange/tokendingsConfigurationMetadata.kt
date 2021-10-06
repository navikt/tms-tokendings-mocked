package no.nav.tms.tokendings.mock.exchange

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class TokendingsMetadataBuilder(private val localUrl: String) {
    fun createMetadata(): TokendingsConfigurationMetadata {

        val url = "$localUrl/token"

        return TokendingsConfigurationMetadata(url)
    }
}

@Serializable
data class TokendingsConfigurationMetadata(
        @SerialName("token_endpoint") val tokenEndpoint: String,
        @SerialName("issuer") val issuer: String = "", //TODO use real issuer
        @SerialName("jwks_uri") val jwksUri: String = "" //TODO give real url
)
