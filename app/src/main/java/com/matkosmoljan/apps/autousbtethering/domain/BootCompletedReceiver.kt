package com.matkosmoljan.apps.autousbtethering.domain

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_BOOT_COMPLETED
import android.content.Intent.ACTION_LOCKED_BOOT_COMPLETED
import com.matkosmoljan.apps.autousbtethering.MainActivity

class BootCompletedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == ACTION_LOCKED_BOOT_COMPLETED || intent.action == ACTION_BOOT_COMPLETED) {
            MainActivity
                .createIntent(context)
                .let(context::startActivity)
        }
    }
}