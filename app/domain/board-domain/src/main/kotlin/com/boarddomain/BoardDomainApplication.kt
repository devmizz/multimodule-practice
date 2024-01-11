package com.boarddomain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoardDomainApplication

fun main(args: Array<String>) {
    runApplication<BoardDomainApplication>(*args)
}
