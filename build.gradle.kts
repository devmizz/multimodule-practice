plugins {
    kotlin("jvm") version "1.9.21"
}

allprojects {
    group = "org"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    java.sourceCompatibility = JavaVersion.VERSION_17
    java.targetCompatibility = JavaVersion.VERSION_17

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }
}
