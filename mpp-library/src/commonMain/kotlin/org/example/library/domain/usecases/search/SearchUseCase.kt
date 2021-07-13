 
package org.example.library.domain.usecases.search

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.library.data.model.search.search.SearchRequest                      
import org.example.library.data.model.search.search.SearchResponse
import org.example.library.domain.data.DataState
import org.example.library.domain.services.search.SearchApiService

class SearchUseCase(val service: SearchApiService) {

    fun execute(request: SearchRequest): Flow<DataState<SearchResponse>> = flow {
        try {
            emit(DataState.loading<SearchResponse>())

            val result = service.search( request)

            emit(DataState.success(result))

        } catch (e: Exception) {
            emit(DataState.error<SearchResponse>(e.message ?: "Unknown Error"))
        }
    }

}
                    