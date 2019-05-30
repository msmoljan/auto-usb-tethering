package com.matkosmoljan.apps.autousbtethering.domain.shell

private const val METHOD_NUMBER_PLACEHOLDER = "[METHOD_NUMBER]"
private const val USB_TETHERING_SWITCH_COMMAND = "su -c service call connectivity $METHOD_NUMBER_PLACEHOLDER i32"
private const val USB_TETHERING_SWITCH_ON_COMMAND = "$USB_TETHERING_SWITCH_COMMAND 0"
private const val USB_TETHERING_SWITCH_OFF_COMMAND = "$USB_TETHERING_SWITCH_COMMAND 1"


/**
 * Generates shell commands for turning USB tethering on or off.
 *
 * Reference: https://stackoverflow.com/a/24346101
 */
object TetherSwitchShellCommandGenerator {

    /**
     * Generates a command for switching USB tethering on using the connectivity service. The [methodNumber] depends on
     * the Android version.
     */
    fun generateSwitchOnCommand(methodNumber: Int): String {
        return USB_TETHERING_SWITCH_ON_COMMAND
            .replace(METHOD_NUMBER_PLACEHOLDER, methodNumber.toString())
    }

    /**
     * Generates a command for switching USB tethering off using the connectivity service. The [methodNumber] depends on
     * the Android version.
     */
    fun generateSwitchOffCommand(methodNumber: Int): String {
        return USB_TETHERING_SWITCH_OFF_COMMAND
            .replace(METHOD_NUMBER_PLACEHOLDER, methodNumber.toString())
    }

}