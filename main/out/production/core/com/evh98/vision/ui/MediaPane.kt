package com.evh98.vision.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.util.Graphics
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.evh98.vision.Vision
import com.badlogic.gdx.graphics.g2d.Sprite
import com.evh98.vision.util.Palette

class MediaPane(val color: Color, val text: String, val poster: Sprite) {

    val Vision = Vision()
    val Graphics = Graphics()

    var font = Graphics.createFont(Graphics.font_roboto_thin, 100);

    init {
        var formatted_text = text
        if (formatted_text.length > 15 && formatted_text.length < 15 * 2) {
            formatted_text = StringBuilder(formatted_text).insert(15, "\n").toString()
        } else if (formatted_text.length > 15 * 2) {
            formatted_text = formatted_text.substring(0, 15 * 2)
            formatted_text = StringBuilder(formatted_text).insert(15, "\n").toString()
            formatted_text = StringBuilder(formatted_text).insert(15 * 2 + 1, "...").toString()
        }
    }

    /**
     * Rendering of the main standard pane
     */
    fun renderUnselect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer, x: Float) {
        drawPoster(sprite_batch, poster, x);
        drawTitle(sprite_batch, shape_renderer, Palette.DARK_GRAY, x);
    }

    /**
     * Rendering of the main selected pane
     */
    fun renderSelect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer, x: Float) {
        drawPoster(sprite_batch, poster, x);
        drawTitle(sprite_batch, shape_renderer, color, x);
    }

    private fun drawPoster(sprite_batch: SpriteBatch, poster: Sprite, x: Float) {
        sprite_batch.begin()
        Graphics.drawSprite(sprite_batch, poster, x, y = 410F, width = 730F, height = 1082F)
        sprite_batch.end()
    }

    private fun drawTitle(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer, color: Color, x: Float) {
        shape_renderer.begin(ShapeType.Filled)
        shape_renderer.color = color
        Graphics.drawRect(shape_renderer, x, y = 670F, width = 730F, height = 260F)
        shape_renderer.end()
        sprite_batch.begin()
        Graphics.drawText(sprite_batch, font, text, x + 365, y = 540F)
        sprite_batch.end()
    }
}