package com.presentation.controller

import com.userapplication.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class UserController(
    private val userService: UserService
) {

    @PostMapping
    fun save() {
        val randomName = UUID.randomUUID().toString()
        userService.save(randomName)
    }
}
