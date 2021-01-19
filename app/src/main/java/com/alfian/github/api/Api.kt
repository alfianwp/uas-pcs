package com.alfian.github.api

import com.alfian.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 7882f4a0d20f9ccb5fa0d511e3680869e5bffc80")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
}