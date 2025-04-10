package com.example.modulithtest.users.api

import com.example.modulithtest.users.UsersService

/**
 * Client wrapper for the UsersService
 * This class provides controlled access to users functionality
 */
class UsersClient {
    private val usersService = UsersService()
    
    fun getUsers(): String {
        return usersService.getUsers()
    }
}
