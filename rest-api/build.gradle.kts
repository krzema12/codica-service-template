plugins {
    buildsrc.convention.`kotlin-jvm`
    application
}

dependencies {
    implementation(projects.core)

    implementation("io.ktor:ktor-server-core:2.1.2")
    implementation("io.ktor:ktor-server-cio:2.1.2")
}

application {
    mainClass.set("it.krzeminski.codicaservicetemplate.MainKt")
}
