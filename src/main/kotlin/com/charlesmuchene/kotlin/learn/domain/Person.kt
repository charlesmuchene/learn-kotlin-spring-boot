package com.charlesmuchene.kotlin.learn.domain

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Person(@Id val id: Long, val firstName: String, val lastName: String, val birthdate: LocalDate? = null)