package com.userdomain.repository

import com.userdomain.entity.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    private val storage: MutableMap<String, User> = mutableMapOf()

    fun save(user: User): User {
        storage[user.id] = user
        return user
    }
}
