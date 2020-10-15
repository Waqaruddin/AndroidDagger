package com.example.androiddagger

import dagger.Component
import dagger.Module
import dagger.Provides

fun main(){
    val a = DaggerMyComponent2.create().getA()
    a.m2()
}


@Module
class MyModule{

    @Provides
    fun getA():A{
        return A()
    }

}

// removed inject
class A {

    fun m2(){
        print("Hello")
    }
}

@Component(modules = [MyModule::class])
interface MyComponent2{
    fun getA():A
}



