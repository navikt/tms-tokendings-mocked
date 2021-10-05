import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    kotlin("jvm").version(Kotlin.version)
    kotlin("plugin.allopen").version(Kotlin.version)

    id(Shadow.pluginId) version (Shadow.version)

    // Apply the application plugin to add support for building a CLI application.
    application
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

repositories {
    mavenCentral()
    maven("https://packages.confluent.io/maven")
    maven("https://jitpack.io")
    mavenLocal()
}

dependencies {
    implementation(Jackson.dataTypeJsr310)
    implementation(Kotlinx.coroutines)
    implementation(Ktor.auth)
    implementation(Ktor.authJwt)
    implementation(Ktor.clientApache)
    implementation(Ktor.clientJackson)
    implementation(Ktor.clientJson)
    implementation(Ktor.clientLogging)
    implementation(Ktor.clientLoggingJvm)
    implementation(Ktor.clientSerializationJvm)
    implementation(Ktor.jackson)
    implementation(Ktor.serverNetty)
    implementation(Logback.classic)
    implementation(Logstash.logbackEncoder)
    implementation(Nimbusds.joseJwt)
    implementation(DittNAV.Common.logging)

    testImplementation(Junit.api)
    testImplementation(Ktor.clientMock)
    testImplementation(Ktor.clientMockJvm)
    testImplementation(Mockk.mockk)
    testImplementation(Jjwt.api)

    testRuntimeOnly(Jjwt.impl)
    testRuntimeOnly(Jjwt.jackson)
    testRuntimeOnly(Junit.engine)
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }

    register("runServer", JavaExec::class) {

        mainClass.set(application.mainClass)
        classpath = sourceSets["main"].runtimeClasspath
    }
}

apply(plugin = Shadow.pluginId)
