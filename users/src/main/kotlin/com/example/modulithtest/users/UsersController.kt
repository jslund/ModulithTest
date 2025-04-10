package com.example.modulithtest.users

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UsersController {
    private val usersService: UsersService = UsersService()

    @GetMapping("/api/user")
    fun index(): String {
        return usersService.getUsers()
    }
}
