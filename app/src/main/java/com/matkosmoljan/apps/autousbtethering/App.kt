package com.matkosmoljan.apps.autousbtethering

import android.app.Application
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import com.matkosmoljan.apps.autousbtethering.domain.shell.ShellTetherSwitch
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(createAppModule())
        }
    }

    private fun createAppModule() = module {
        single<TetherSwitch> { ShellTetherSwitch() }
    }
}