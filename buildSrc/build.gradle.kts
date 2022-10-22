plugins {
    `kotlin-dsl`
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    implementation(enforcedPlatform("org.jetbrains.kotlin:kotlin-bom:1.7.20"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")

    implementation("org.jlleitschuh.gradle:ktlint-gradle:11.0.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0")
}
