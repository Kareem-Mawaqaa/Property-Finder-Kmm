package org.example.library.di

import org.example.library.di.runner.Runner
import org.example.library.domain.service.account.AccountApiService
import org.example.library.domain.service.account.AccountApiServiceImpl
import kotlin.reflect.KClass


class ServiceLocator internal constructor() {

    private val serviceMap: HashMap<Any, Any> = hashMapOf()


    init {

//        register(Json::class, lazy { json() })
//        register(HttpClient::class, lazy { httpClient() })

        register(AccountApiService::class, lazy { AccountApiServiceImpl() })

        Runner(this)

    }


    inline fun <reified T : Any> instance(): T {
        return provide(T::class)
    }

    fun <T : Any> register(clz: KClass<T>, service: Any): Any? =
        serviceMap.put(clz.simpleName!!, service)


    fun <T : Any> provide(clz: KClass<T>): T {
        if (serviceMap[clz.simpleName!!] is Lazy<*>) {
            val objec = serviceMap[clz.simpleName!!] as Lazy<*>
            return objec.value as T
        }

        val result = serviceMap[clz.simpleName!!] as T
        return result
    }

//
//    private fun json(): Json = Json {
//        ignoreUnknownKeys = true
//    }


}


val ServiceLocatorInstance = ServiceLocator()

inline fun <reified T : Any> Instance(): T {
    return ServiceLocatorInstance.provide(T::class)
}


