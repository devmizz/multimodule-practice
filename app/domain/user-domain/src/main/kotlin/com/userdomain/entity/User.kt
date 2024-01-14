package com.userdomain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class User(
    name: String
) {

    @Id
    val id: String = UUID.randomUUID().toString()
    val name: String = name
}
