package com.evh98.vision.screens

import com.evh98.vision.Vision
import com.evh98.vision.ui.BigPane
import com.evh98.vision.util.Controller
import com.evh98.vision.util.Icons
import com.evh98.vision.util.Palette

class HomeScreen(vision: Vision) : VisionScreen(vision) {

    var x = -1
    var y = -1

    var games = BigPane(color = Palette.RED, text = "Games", icon = Icons.GAMES!!, x = 320F, y = 248F)
    var media = BigPane(color = Palette.BLUE, text = "Media", icon = Icons.MEDIA!!, x = 1984F, y = 248F)
    var apps = BigPane(color = Palette.YELLOW, text = "Apps", icon = Icons.APPS!!, x = 320F, y = 1128F)
    var system = BigPane(color = Palette.GREEN, text = "System", icon = Icons.SETTINGS!!, x = 1984F, y = 1128F)

    override fun show() {
        super.show()

        start(Palette.WHITE)
    }

    override fun draw(delta: Float) {
        renderGamesPane()
        renderMediaPane()
        renderAppsPane()
        renderSystemPane()
    }

    override fun update() {
        super.update()

        if (Controller.isNavigationKey()) {
            val newCoords = Controller.getNewXY(x, y, 2, 2, 4)
            x = newCoords[0]
            y = newCoords[1]
        }
        else if (Controller.isGreen()) {
            if (x == 1 && y == 1) changeScreen(vision.gameScreen!!)
        }
        else if (Controller.isRed()) {
            vision.terminate()
        }
    }

    fun renderGamesPane() {
        if (x == 1 && y == 1) games.renderSelect(sprite_batch, shape_renderer)
        else games.renderUnselect(sprite_batch, shape_renderer)
    }

    fun renderMediaPane() {
        if (x == 2 && y == 1) media.renderSelect(sprite_batch, shape_renderer)
        else media.renderUnselect(sprite_batch, shape_renderer)
    }

    fun renderAppsPane() {
        if (x == 1 && y == 2) apps.renderSelect(sprite_batch, shape_renderer)
        else apps.renderUnselect(sprite_batch, shape_renderer)
    }

    fun renderSystemPane() {
        if (x == 2 && y == 2) system.renderSelect(sprite_batch, shape_renderer)
        else system.renderUnselect(sprite_batch, shape_renderer)
    }
}