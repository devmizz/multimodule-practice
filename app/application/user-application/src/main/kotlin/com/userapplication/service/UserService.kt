package com.userapplication.service

import com.userdomain.entity.User
import ifTrue
import org.springframework.stereotype.Service

@Service
class UserService {

    fun save() {
        true.ifTrue { println("this is true") }

        User("id", "name")
        // Board("id", "title")
    }
}
