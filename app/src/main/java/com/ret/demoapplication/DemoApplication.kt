package com.ret.demoapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class DemoApplication() : Application() {

    companion object{
        lateinit var demoApplication : DemoApplication
    }
    override fun onCreate() {
        super.onCreate()
        demoApplication=this
    }
}
