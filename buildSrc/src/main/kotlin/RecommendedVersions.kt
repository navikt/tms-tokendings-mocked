/**
 * Anbefalte versjoner av tredjepartsbiblioteker.
 */

object DittNAV {
    object Common {
        private const val version = "2021.05.18-12.42-9ba5c329c21d"
        private const val groupId = "com.github.navikt.dittnav-common-lib"

        const val logging = "$groupId:dittnav-common-logging:$version"
        const val influx = "$groupId:dittnav-common-influx:$version"
        const val influxdb = "$groupId:dittnav-common-influxdb:$version"
        const val securityAuthenticatedUser = "$groupId:dittnav-common-security-authenticated-user:$version"
        const val utils = "$groupId:dittnav-common-utils:$version"
        const val evictingCache = "$groupId:dittnav-common-evicting-cache:$version"
    }
}

object Jackson {
    private const val version = "2.12.1"
    const val dataTypeJsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$version"
    const val moduleKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:$version"
}

object Junit {
    private const val version = "5.4.1"
    private const val groupId = "org.junit.jupiter"

    const val api = "$groupId:junit-jupiter-api:$version"
    const val engine = "$groupId:junit-jupiter-engine:$version"
    const val params = "$groupId:junit-jupiter-params:$version"
}

object Jjwt {
    private const val version = "0.11.2"
    private const val groupId = "io.jsonwebtoken"

    const val api = "$groupId:jjwt-api:$version"
    const val impl = "$groupId:jjwt-impl:$version"
    const val jackson = "$groupId:jjwt-jackson:$version"
}

object Kluent {
    private const val version = "1.68"
    const val kluent = "org.amshove.kluent:kluent:$version"
}

object Kotlin {
    const val version = "1.4.31"
    private const val groupId = "org.jetbrains.kotlin"

    const val reflect = "$groupId:kotlin-reflect:$version"
}

object Kotlinx {
    private const val groupId = "org.jetbrains.kotlinx"

    const val coroutines = "$groupId:kotlinx-coroutines-core:1.4.2"
    const val htmlJvm = "$groupId:kotlinx-html-jvm:0.7.2"
    const val atomicfu = "$groupId:atomicfu:0.14.4"
}

object Ktor {
    const val version = "1.5.4"
    private const val groupId = "io.ktor"

    const val auth = "$groupId:ktor-auth:$version"
    const val authJwt = "$groupId:ktor-auth-jwt:$version"
    const val htmlBuilder = "$groupId:ktor-html-builder:$version"
    const val http = "$groupId:ktor-http-jvm:$version"
    const val jackson = "$groupId:ktor-jackson:$version"
    const val serverNetty = "$groupId:ktor-server-netty:$version"
    const val clientApache = "$groupId:ktor-client-apache:$version"
    const val clientCio = "$groupId:ktor-client-cio:$version"
    const val clientCore = "$groupId:ktor-client-core:$version"
    const val clientJson = "$groupId:ktor-client-json:$version"
    const val clientSerializationJvm = "$groupId:ktor-client-serialization-jvm:$version"
    const val clientJackson = "$groupId:ktor-client-jackson:$version"
    const val clientLogging = "$groupId:ktor-client-logging:$version"
    const val clientLoggingJvm = "$groupId:ktor-client-logging-jvm:$version"
    const val clientMock = "$groupId:ktor-client-mock:$version"
    const val clientMockJvm = "$groupId:ktor-client-mock-jvm:$version"
    const val serverTestHost = "$groupId:ktor-server-test-host:$version"
}

object Logback {
    private const val version = "1.2.3"
    const val classic = "ch.qos.logback:logback-classic:$version"
}

object Logstash {
    private const val version = "6.4"
    const val logbackEncoder = "net.logstash.logback:logstash-logback-encoder:$version"
}

object Mockk {
    private const val version = "1.10.5"
    const val mockk = "io.mockk:mockk:$version"
}

object Shadow {
    const val version = "7.0.0"
    const val pluginId = "com.github.johnrengelman.shadow"
}

object Nimbusds {
    private const val version = "8.20"
    private const val groupId = "com.nimbusds"

    const val joseJwt = "$groupId:nimbus-jose-jwt:$version"
    const val oauth2OidcSdk =  "$groupId:oauth2-oidc-sdk:$version"
}
