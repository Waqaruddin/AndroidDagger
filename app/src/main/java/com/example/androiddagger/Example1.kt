package com.example.androiddagger

import dagger.Component
import javax.inject.Inject


fun main(){

    val b = DaggerMyComponent.create().getB()
    b.m2()
}

class B @Inject constructor(){
    fun m2(){
        print("World")
    }
}

@Component
interface MyComponent{

    fun getB():B
}
