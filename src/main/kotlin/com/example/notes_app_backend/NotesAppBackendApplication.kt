package com.example.notes_app_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotesAppBackendApplication

fun main(args: Array<String>) {
	runApplication<NotesAppBackendApplication>(*args)
}
