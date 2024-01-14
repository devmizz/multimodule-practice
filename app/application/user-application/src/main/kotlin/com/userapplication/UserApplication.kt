package com.userapplication

import com.userdomain.config.UserDomainConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(UserDomainConfig::class)
class UserApplication

fun main(args: Array<String>) {
    runApplication<UserApplication>(*args)
}
