package com.matkosmoljan.apps.autousbtethering.domain.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.matkosmoljan.apps.autousbtethering.domain.TetherSwitch
import com.matkosmoljan.apps.autousbtethering.domain.shell.ShellTetherSwitch


class UsbAttachedReceiver : BroadcastReceiver() {

    private val tetherSwitch: TetherSwitch = ShellTetherSwitch()

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.hardware.usb.action.USB_STATE") {
            tetherSwitch.turnTetheringOn()
        }
    }
}