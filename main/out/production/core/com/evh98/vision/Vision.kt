package com.evh98.vision

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.evh98.vision.screens.HomeScreen
import com.evh98.vision.screens.SplashScreen

class Vision : Game() {

    val BUILD_NUMBER = 1
    var WIDTH = 3840F
    var HEIGHT = 2160F
    var SCALE = 1

    var splash_screen: SplashScreen? = null

    var home_screen: HomeScreen? = null

    override fun create() {
        splash_screen = SplashScreen(this)

        setScreen(splash_screen)
    }

    fun terminate() {
        Gdx.app.exit()
    }
}
