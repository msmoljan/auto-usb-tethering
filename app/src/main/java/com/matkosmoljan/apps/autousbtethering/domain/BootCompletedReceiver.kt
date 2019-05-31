package com.matkosmoljan.apps.autousbtethering.domain

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.matkosmoljan.apps.autousbtethering.MainActivity

class BootCompletedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_LOCKED_BOOT_COMPLETED) {
            MainActivity
                .createIntent(context)
                .let(context::startActivity)
        }
    }
}