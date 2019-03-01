package com.charlesmuchene.kotlin.learn.repository

import com.charlesmuchene.kotlin.learn.domain.Person
import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long>