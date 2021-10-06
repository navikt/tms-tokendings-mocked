package no.nav.tms.tokendings.mock.config

import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.routing.routing
import io.ktor.serialization.*
import no.nav.tms.tokendings.mock.exchange.tokenApi
import no.nav.tms.tokendings.mock.health.healthApi

fun Application.mainModule(appContext: ApplicationContext = ApplicationContext()) {
    install(DefaultHeaders)

    install(ContentNegotiation) {
        json(jsonConfig())
    }

    routing {
        healthApi()
        tokenApi(appContext.builder)
    }
}
