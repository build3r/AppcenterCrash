package com.builder.appcentercrash

import android.app.Application
import android.util.Log

import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.distribute.Distribute


class App: Application() {
    override fun onCreate() {
        super.onCreate()
        AppCenter.setLogLevel(Log.VERBOSE)
        AppCenter.start(
            this, "e4ab3755-5c79-43bc-9eba-a02ee5071145", Distribute::class.java
        )
    }
}