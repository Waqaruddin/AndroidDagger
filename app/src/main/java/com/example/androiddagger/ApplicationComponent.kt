package com.example.androiddagger

import dagger.Component


@Component
interface ApplicationComponent{

//    fun getMessageProviders():MessageProviders


    fun inject(activity:MainActivity)

}