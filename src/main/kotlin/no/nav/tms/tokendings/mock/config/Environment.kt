package no.nav.tms.tokendings.mock.config

class Environment(
        val localUrl: String = getEnvVar("LOCAL_URL")
)

fun getEnvVar(varName: String): String {
    return System.getenv(varName)
            ?: throw IllegalArgumentException("Appen kan ikke starte uten av miljøvariabelen $varName er satt.")
}
