package com.userapplication.service

import com.userdomain.entity.User
import com.userdomain.repository.UserRepository
import ifTrue
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class UserService(
    @Value("\${user.id}")
    private val userId: String,
    private val userRepository: UserRepository
) {

    init {
        println("userId: ${userId}")
    }

    fun save(randomName: String): User {
        true.ifTrue { println("this is true") }

        return userRepository.save(User(randomName))
    }
}
