package no.nav.tms.tokendings.mock.exchange

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.http.ContentType.Application
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.tokenApi(tokendingsMetadataBuilder: TokendingsMetadataBuilder) {
    get("/.well-known/oauth-authorization-server") {
        val metadata = tokendingsMetadataBuilder.createMetadata()

        call.respond(metadata)
    }

    post("/token") {
        val token = call.receiveToken()

        if (token != null) {
            call.respond(TokenResponse(token))
        } else {
            call.respondText("", status = HttpStatusCode.BadRequest)
        }
    }

    get("/jwk/generate") {
        call.respondText(JwkBuilder.generateJwkString(), contentType = Application.Json)
    }

}

private suspend fun ApplicationCall.receiveToken(): String? {
    val params = receiveParameters()

    return params["subject_token"]
}
