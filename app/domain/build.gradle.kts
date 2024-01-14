import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("plugin.jpa") version "1.7.22"
}

allprojects {
    apply {
        plugin("kotlin-jpa")
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
        implementation("org.springframework.boot:spring-boot-starter-jdbc")

        runtimeOnly("com.h2database:h2")
    }

    allOpen {
        annotation("javax.persistence.Entity")
        annotation("javax.persistence.MappedSuperclass")
        annotation("javax.persistence.Embeddable")
    }

    tasks.withType<BootJar> {
        enabled = false
    }
}
