package com.userapplication.service

import com.userdomain.entity.User
import com.userdomain.repository.UserRepository
import ifTrue
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun save(randomName: String): User {
        true.ifTrue { println("this is true") }

        return userRepository.save(User(randomName))
    }
}
