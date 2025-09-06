package com.example.notes_app_backend.security

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component

@Component
class HashEncoder {

    private val bcrypt = BCryptPasswordEncoder()

    fun encode(rawString:String): String = bcrypt.encode(rawString)

    fun matches(rawString: String, hashed: String): Boolean = bcrypt.matches(rawString, hashed)

}