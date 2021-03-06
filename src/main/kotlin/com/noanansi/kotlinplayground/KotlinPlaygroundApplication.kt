package com.noanansi.kotlinplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPlaygroundApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<KotlinPlaygroundApplication>(*args)
}
