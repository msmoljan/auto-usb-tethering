package com.matkosmoljan.apps.autousbtethering.domain

import com.matkosmoljan.apps.autousbtethering.FunctionResult

/**
 * Turns USB tethering on. Implementations may vary depending on the Android version used, device etc.
 */
interface TetherSwitch {
    fun turnTetheringOn(): FunctionResult<Unit>
}