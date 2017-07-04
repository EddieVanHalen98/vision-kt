package com.evh98.vision

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.evh98.vision.screens.GameScreen
import com.evh98.vision.screens.HomeScreen
import com.evh98.vision.screens.SplashScreen
import com.evh98.vision.screens.VisionScreen
import com.evh98.vision.ui.Search
import java.util.*

class Vision : Game() {

    val BUILD_NUMBER = 1
    var WIDTH = 1280F
    var HEIGHT = 720F
    var SCALE = 0.33333333333333333F

    var screenStack: Stack<VisionScreen>? = null

    var splashScreen: SplashScreen? = null

    var homeScreen: HomeScreen? = null
    var gameScreen: GameScreen? = null

    var search: Search? = null

    override fun create() {
        splashScreen = SplashScreen(this)

        setScreen(splashScreen)
    }

    fun terminate() {
        Gdx.app.exit()
    }
}
