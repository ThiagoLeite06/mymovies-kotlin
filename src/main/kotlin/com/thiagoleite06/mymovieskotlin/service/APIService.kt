package com.thiagoleite06.mymovieskotlin.service

import com.google.gson.Gson
import com.thiagoleite06.mymovieskotlin.model.Series
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class APIService {
    private val BASE_URL = "https://www.omdbapi.com/?t="
    private val API_KEY = "&apikey=3dac087c"

    fun fetchSerie(title: String) {
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL+title+API_KEY))
            .build()
        val response = client
            .send(request, HttpResponse.BodyHandlers.ofString())

        val json = response.body()

        val gson = Gson()
        val serie = gson.fromJson(json, Series::class.java)
        println(serie)
    }
}