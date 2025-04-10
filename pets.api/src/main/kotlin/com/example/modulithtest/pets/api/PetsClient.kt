package com.example.modulithtest.pets.api

import com.example.modulithtest.pets.PetsService

/**
 * Client wrapper for the PetsService
 * This class provides controlled access to pets functionality
 */
class PetsClient {
    private val petsService = PetsService()
    
    fun getPets(): String {
        return petsService.getPets()
    }
}
