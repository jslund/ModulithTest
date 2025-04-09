package com.example.modulithtest.pets

import com.example.modulithtest.users.internal.UsersRepository

class PetsService {
    private val PetsRepository = PetsRepository()
    private val usersRespository = UsersRepository()

    fun getPets(): String {
        return PetsRepository.findPets()
    }
}