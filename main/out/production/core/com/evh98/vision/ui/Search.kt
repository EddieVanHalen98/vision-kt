package com.evh98.vision.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.Vision
import com.evh98.vision.util.Controller
import com.evh98.vision.util.Graphics
import com.evh98.vision.util.Icons
import com.evh98.vision.util.Palette
import java.text.SimpleDateFormat
import java.util.*


class Search(vision: Vision) {

    var fontTime = Graphics.createFont(Graphics.font_product_sans, 128)
    var fontQuery = Graphics.createFont(Graphics.font_roboto_thin, 128)

    var y = 0

    var isActive = false
    var showResults = false
    var input = ""

    val cal: Calendar = Calendar.getInstance()
    val sdf = SimpleDateFormat("HH:mm")

    fun render(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        renderUI(sprite_batch, shape_renderer)
        renderText(sprite_batch)
        renderResults()
    }

    fun update() {
        if (Controller.isSearch()) {
            toggleSearch()
        }

        if (showResults) {

        } else {
            if (Controller.letterPressed() != "/" && input.length <= 32) input += Controller.letterPressed()
            else if (Controller.digitPressed() != "/" && input.length <= 32) input += Controller.digitPressed()
            else if (Controller.isSpace() && input.length <= 32) input += " "
            else if (Controller.isBackspace() && input.length != 0) input = input.substring(0, input.length - 1);
            else if (Controller.isEnter()) {
                // results.clear();
                // search();
            }
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

    private fun renderText(sprite_batch: SpriteBatch) {
        sprite_batch.begin();
            Graphics.drawText(sprite_batch, fontQuery, input, x = 1920F, y = 1848F);
            Graphics.drawText(sprite_batch, fontTime, sdf.format(cal.getTime()), x = 3560F, y = 1848F);
        sprite_batch.end();
    }

    private fun renderResults() {

    }

    fun toggleSearch() {
        input = ""
        isActive = !isActive
        y = 0
    }
}