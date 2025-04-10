package com.example.modulithtest.users

import com.example.modulithtest.users.internal.UsersRepository

class UsersService {
    private val usersRespository = UsersRepository()

    fun getUsers(): String {
        return usersRespository.findUsers()
    }
}
