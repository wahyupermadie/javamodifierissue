package com.example.myapplication.provider

import com.example.myapplication.MainActivity
import com.example.myapplication.MainViewModel

/**
 * Created by putu.permadi on 04/11/23.
 */
class ModuleActivityKotlin {

    fun provideMainActivity(mainActivity: MainActivity): MainViewModel {
        return MainViewModel(mainActivity)
    }
}