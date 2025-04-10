package com.example.modulithtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.example.modulithtest", "com.example.modulithtest.users", "com.example.modulithtest.pets"])
class ModulithTestApplication

fun main(args: Array<String>) {
    runApplication<ModulithTestApplication>(*args)
}
