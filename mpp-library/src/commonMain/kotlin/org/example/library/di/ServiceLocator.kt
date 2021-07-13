package org.example.library.di

import org.example.library.di.runner.Runner
import kotlin.reflect.KClass


class ServiceLocator internal constructor() {

    private val serviceMap: HashMap<Any, Any> = hashMapOf()


    // TODO Auto Load Dependencies
    fun  runner() = Runner(this)


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



}


val ServiceLocatorInstance = ServiceLocator()

inline fun <reified T : Any> Instance(): T {
    return ServiceLocatorInstance.provide(T::class)
}


