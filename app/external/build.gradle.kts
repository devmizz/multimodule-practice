import org.springframework.boot.gradle.tasks.bundling.BootJar

allprojects {
    tasks.withType<BootJar> {
        enabled = false
    }
}
