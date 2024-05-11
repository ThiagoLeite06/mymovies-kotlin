package com.thiagoleite06.mymovieskotlin

import com.thiagoleite06.mymovieskotlin.service.APIService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MymoviesKotlinApplication

fun main() {
	val service = APIService()
	service.fetchSerie("friends")
}
