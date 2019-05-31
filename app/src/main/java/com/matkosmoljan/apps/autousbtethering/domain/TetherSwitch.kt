package com.matkosmoljan.apps.autousbtethering.domain


/**
 * Turns USB tethering on. Implementations may vary depending on the Android version used, device etc.
 */
interface TetherSwitch {
    fun turnTetheringOn()
}