package com.evh98.vision.screens

import com.evh98.vision.Vision
import com.evh98.vision.models.Models
import com.evh98.vision.util.Controller
import com.evh98.vision.util.Graphics
import com.evh98.vision.util.Palette

class GameScreen(vision: Vision): VisionScreen(vision) {

    override fun show() {
        super.show()

        start(Palette.RED)
    }

    override fun draw(delta: Float) {
        for (game in Models.games) {
            sprite_batch.begin()
                Graphics.drawSprite(sprite_batch = sprite_batch, sprite = game.icon!!,
                        x = 320F, y = 278F, width = 920F, height = 430F)
            sprite_batch.end()
        }
    }

    override fun update() {
        if (Controller.isRed()) {
            vision.screen = vision.home_screen
        }
    }
}