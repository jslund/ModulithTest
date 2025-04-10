package com.example.modulithtest.pets

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PetsController {
    private val petsService: PetsService = PetsService()

    @GetMapping("/api/pet")
    fun index(): String {
        return petsService.getPets()
    }
}
