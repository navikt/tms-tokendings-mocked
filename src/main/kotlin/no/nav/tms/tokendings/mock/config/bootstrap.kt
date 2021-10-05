package no.nav.tms.tokendings.mock.config

import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import no.nav.tms.tokendings.mock.exchange.tokenApi
import no.nav.tms.tokendings.mock.health.healthApi

fun Application.mainModule(appContext: ApplicationContext = ApplicationContext()) {
    install(DefaultHeaders)
    install(ContentNegotiation) {
        jackson {
            enableMineSakerJsonConfig()
        }
    }

    routing {
        healthApi()
        tokenApi()
    }
}
