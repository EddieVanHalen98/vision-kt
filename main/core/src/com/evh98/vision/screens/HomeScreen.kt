package com.evh98.vision.screens

import com.evh98.vision.Vision
import com.evh98.vision.ui.BigPane
import com.evh98.vision.util.Palette

class HomeScreen(vision: Vision) : VisionScreen(vision) {

    var x = -1
    var y = -1

    var games = BigPane(color = Palette.RED, text = "Games", x = 320F, y = 248F)
    var media = BigPane(color = Palette.BLUE, text = "Media", x = 1984F, y = 248F)
    var apps = BigPane(color = Palette.YELLOW, text = "Apps", x = 320F, y = 1128F)
    var system = BigPane(color = Palette.GREEN, text = "System", x = 1984F, y = 1128F)

    override fun show() {
        super.show()
    }

    override fun draw(delta: Float) {
        if (x == 1 && y == 1) games.renderSelect(sprite_batch, shape_renderer)
        else games.renderUnselect(sprite_batch, shape_renderer)

        if (x == 2 && y == 1) media.renderSelect(sprite_batch, shape_renderer)
        else media.renderUnselect(sprite_batch, shape_renderer)

        if (x == 1 && y == 2) apps.renderSelect(sprite_batch, shape_renderer)
        else apps.renderUnselect(sprite_batch, shape_renderer)

        if (x == 2 && y == 2) system.renderSelect(sprite_batch, shape_renderer)
        else system.renderUnselect(sprite_batch, shape_renderer)
    }
}