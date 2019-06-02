package com.matkosmoljan.apps.autousbtethering

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import org.koin.android.ext.android.inject

class MainActivity : Activity() {

    companion object {
        fun createIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    private val tetherSwitch: TetherSwitch by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tetherSwitch.turnTetheringOn().fold(
            onSuccess = { finish() },
            onFailure = { showError(it) }
        )
    }

    private fun showError(exception: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
