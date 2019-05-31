package com.matkosmoljan.apps.autousbtethering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val tetherSwitch: TetherSwitch by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tetherSwitch.turnTetheringOn()
    }
}
