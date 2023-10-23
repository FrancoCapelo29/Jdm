package com.example.jdmapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JdmAppApplication

fun main(args: Array<String>) {
	runApplication<JdmAppApplication>(*args)
}
