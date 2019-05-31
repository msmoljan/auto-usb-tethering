package com.matkosmoljan.apps.autousbtethering

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context) = Intent(context, MainActivity::class.java)
    }

    private val tetherSwitch: TetherSwitch by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tetherSwitch.turnTetheringOn()
    }
}
