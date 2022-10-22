package it.krzeminski.codicaservicetemplate.usecases

import it.krzeminski.codicaservicetemplate.model.HelloWorldMessage

class HelloWorldUseCase {
    operator fun invoke(): HelloWorldMessage =
        HelloWorldMessage(message = "Hello world!")
}
