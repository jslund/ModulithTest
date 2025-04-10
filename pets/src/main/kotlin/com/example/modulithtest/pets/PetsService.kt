package com.example.modulithtest.pets

import com.example.modulithtest.users.api.UsersClient

class PetsService {
    private val PetsRepository = PetsRepository()
    private val usersClient = UsersClient()

    fun getPets(): String {
        return PetsRepository.findPets()
    }
}
