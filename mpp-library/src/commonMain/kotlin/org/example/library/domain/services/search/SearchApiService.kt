package org.example.library.domain.services.search

import org.example.library.data.model.search.search.SearchResponse         
import org.example.library.data.model.search.search.SearchRequest
        
interface SearchApiService {

    suspend fun search(request: SearchRequest): SearchResponse
   
}
            
