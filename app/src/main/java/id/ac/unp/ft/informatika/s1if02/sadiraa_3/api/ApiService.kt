package id.ac.unp.ft.informatika.s1if02.sadiraa_3.api

import id.ac.unp.ft.informatika.s1if02.sadiraa_3.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}