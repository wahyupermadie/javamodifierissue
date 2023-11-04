package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.provider.ModuleActivityJava
import com.example.myapplication.provider.ModuleActivityKotlin

class MainActivity : AppCompatActivity(), ClickListener {

    private lateinit var mainViewModel: MainViewModel

    private lateinit var mainViewModel2: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this will cause Error java.lang.IllegalAccessError: Illegal class access
        // because ModuleActivityKotlin is kotlin and ClickListener using default modifier
        mainViewModel = ModuleActivityKotlin().provideMainActivity(this)

        mainViewModel2 = ModuleActivityJava().provideMainActivity(this)

        findViewById<View>(R.id.clickListener1).setOnClickListener {
            mainViewModel.click()
        }

        findViewById<View>(R.id.clickListener2).setOnClickListener {
            mainViewModel2.click()
        }
    }

    override fun handleViewClickBtnOne() {
        Log.d("DATA_GUE", "handleViewClickBtnOne: ")
    }
}