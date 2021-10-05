package no.nav.tms.tokendings.mock.config

import org.slf4j.LoggerFactory

class ApplicationContext {

    private val log = LoggerFactory.getLogger(ApplicationContext::class.java)

    val environment = Environment()
}
