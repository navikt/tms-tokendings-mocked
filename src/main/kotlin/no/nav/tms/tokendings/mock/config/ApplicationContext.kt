package no.nav.tms.tokendings.mock.config

import no.nav.tms.tokendings.mock.exchange.TokendingsMetadataBuilder

class ApplicationContext {

    val environment = Environment()

    val builder = TokendingsMetadataBuilder(environment.localUrl)
}
