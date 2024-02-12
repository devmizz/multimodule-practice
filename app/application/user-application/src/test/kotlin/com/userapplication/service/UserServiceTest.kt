package com.userapplication.service

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest @Autowired constructor(
    private val userService: UserService
) {

    @Test
    fun save() {
        val saveUser = userService.save("abc")
        Assertions.assertThat(saveUser.name).isEqualTo("abc")
    }
}
