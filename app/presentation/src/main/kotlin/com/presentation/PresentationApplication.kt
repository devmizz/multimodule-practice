package com.presentation

import com.userapplication.config.UserServiceConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(UserServiceConfig::class)
class PresentationApplication

fun main(args: Array<String>) {
    runApplication<PresentationApplication>(*args)
}
