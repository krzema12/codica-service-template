rootProject.name = "codica-service-template"

apply(from = "./buildSrc/repositories.settings.gradle.kts")

include(
    ":core",
)

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
