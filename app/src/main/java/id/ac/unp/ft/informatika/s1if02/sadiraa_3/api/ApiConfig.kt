package id.ac.unp.ft.informatika.s1if02.sadiraa_3.api

import id.ac.unp.ft.informatika.s1if02.sadiraa_3.ResponseMorty
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"
        fun getRetrofit(): Retrofit {
            return Retrofit.Builder().baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun getService(): ApiService {
            return getRetrofit().create(ApiService::class.java)
        }
    }