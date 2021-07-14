package org.example.library.domain.services.search

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import org.example.library.di.ServiceLocatorInstance
import org.example.library.data.model.search.search.SearchResponse         
import org.example.library.data.model.search.search.SearchRequest
        
class SearchApiServiceImpl :  SearchApiService {

    private val BASE_URL = "http://flythru.phpmawaqaa.com/api"

    fun client() = ServiceLocatorInstance.provide(HttpClient::class)
    
        
    override suspend fun search(request: SearchRequest): SearchResponse  {
         return client().post("$BASE_URL/porter/order/search") {
                contentType(ContentType.Application.Json)
                body = request
                
         }
    }

   
}
