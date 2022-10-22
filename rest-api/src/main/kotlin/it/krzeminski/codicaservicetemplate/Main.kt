package it.krzeminski.codicaservicetemplate

import io.ktor.server.application.call
import io.ktor.server.cio.CIO
import io.ktor.server.engine.embeddedServer
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import it.krzeminski.codicaservicetemplate.usecases.HelloWorldUseCase

fun main() {
    embeddedServer(CIO, port = 8000) {
        routing {
            get("/") {
                val helloWorldUseCase = HelloWorldUseCase()
                val result = helloWorldUseCase()
                call.respondText(result.message)
            }
        }
    }.start(wait = true)
}
