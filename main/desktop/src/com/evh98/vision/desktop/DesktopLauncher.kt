package com.evh98.vision.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.evh98.vision.Vision

object DesktopLauncher {

    @JvmStatic fun main(arg: Array<String>) {
        val cfg = LwjglApplicationConfiguration()

        cfg.width = 1280
        cfg.height = 720

        LwjglApplication(Vision(), cfg)
    }
}
