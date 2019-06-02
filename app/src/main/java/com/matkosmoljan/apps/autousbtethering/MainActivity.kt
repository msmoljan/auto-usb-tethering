package com.matkosmoljan.apps.autousbtethering

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import kotlinx.android.synthetic.main.activity_main.*
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
            onSuccess = {
                hideError()
                finish()
            }
            ,
            onFailure = { showError(it) }
        )
    }

    private fun hideError() {
        errorMessageView.visibility = View.GONE
    }

    private fun showError(exception: Throwable) {
        Log.e("MainActivity", exception.message)
        errorMessageView.visibility = View.VISIBLE
    }
}
