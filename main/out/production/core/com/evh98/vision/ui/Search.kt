package com.evh98.vision.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.Vision
import com.evh98.vision.util.Controller
import com.evh98.vision.util.Graphics
import com.evh98.vision.util.Icons
import com.evh98.vision.util.Palette

class Search(vision: Vision) {

    var fontTime = Graphics.createFont(Graphics.font_product_sans, 128)
    var fontQuery = Graphics.createFont(Graphics.font_roboto_thin, 176)

    var y = 0

    var isActive = false
    var input = ""

    fun render(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        renderUI(sprite_batch, shape_renderer)
        renderText()
        renderResults()
    }

    fun update() {
        if (Controller.isSearch()) {
            toggleSearch()
        }
    }

    private fun renderUI(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        shape_renderer.color = Palette.SYSTEM
        shape_renderer.begin(ShapeRenderer.ShapeType.Filled);
            Graphics.drawRect(shape_renderer, x = 0F, y = 1720F, width = 3840F, height = 256F);
        shape_renderer.end();

        sprite_batch.begin();
            Graphics.drawSprite(sprite_batch, Icons.SEARCH!!, x = 96F, y = 1784F,
                    width = 128F, height = 128F, color = Palette.WHITE);
        sprite_batch.end();
    }

    private fun renderText() {

    }

    private fun renderResults() {

    }

    fun toggleSearch() {
        input = ""
        isActive = !isActive
        y = 0
    }
}