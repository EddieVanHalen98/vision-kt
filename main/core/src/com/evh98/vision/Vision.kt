package com.evh98.vision

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.evh98.vision.screens.GameScreen
import com.evh98.vision.screens.HomeScreen
import com.evh98.vision.screens.SplashScreen
import com.evh98.vision.ui.Search

class Vision : Game() {

    val BUILD_NUMBER = 1
    var WIDTH = 1280F
    var HEIGHT = 720F
    var SCALE = 0.33333333333333333F

    var splash_screen: SplashScreen? = null

    var home_screen: HomeScreen? = null
    var game_screen: GameScreen? = null

    var search: Search? = null

    override fun create() {
        splash_screen = SplashScreen(this)

        setScreen(splash_screen)
    }

    fun terminate() {
        Gdx.app.exit()
    }
}
