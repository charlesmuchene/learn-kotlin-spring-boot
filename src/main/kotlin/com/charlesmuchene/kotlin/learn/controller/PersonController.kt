package com.charlesmuchene.kotlin.learn.controller

import com.charlesmuchene.kotlin.learn.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping("/person")
    fun readAll() = personRepository.findAll()

    @GetMapping("/person/{id}")
    fun readOne(@PathVariable id: Long) = personRepository.findById(id)

}