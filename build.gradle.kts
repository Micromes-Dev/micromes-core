plugins {
    kotlin("jvm") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(group = "org.http4k", name = "http4k-core", version ="3.255.0")
    implementation(group = "org.http4k", name = "http4k-server-jetty", version = "3.255.0")
    implementation(group = "org.http4k", name = "http4k-format-jackson", version = "3.255.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}