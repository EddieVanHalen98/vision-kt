package com.evh98.vision.ui

import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.evh98.vision.Vision
import com.evh98.vision.util.Graphics
import com.evh98.vision.util.Palette

class SmallPane(val screen: Screen, val screen_color: Color, val pane_color: Color, val text: String,
                val icon: Sprite, val positionX: Int, val positionY: Int) {

    val font_text = Graphics.createFont(Graphics.font_roboto_thin, 108)

    var x = 0
    var y = 0

    init {
        x = 192 + ((positionX - 1) * 912)
        y = 270 + ((positionY - 1) * 900)
    }

    /*
	 * Rendering of the main pane
	 */
    fun renderUnselect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        renderRectangle(shape_renderer, Palette.DARK_GRAY)
        renderData(sprite_batch, font_text)
    }

    /*
	 * Rendering of the selected pane
	 */
    fun renderSelect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        renderRectangle(shape_renderer, screen_color)
        renderData(sprite_batch, font_text)
    }

    private fun renderRectangle(shape_renderer: ShapeRenderer, color: Color) {
        shape_renderer.begin(ShapeType.Filled)
        shape_renderer.color = pane_color
        Graphics.drawRect(shape_renderer, x.toFloat(), y.toFloat(), 720f, 542f)
        shape_renderer.color = color
        Graphics.drawRect(shape_renderer, x.toFloat(), (y + 540).toFloat(), 720f, 180f)
        shape_renderer.end()
    }

    private fun renderData(sprite_batch: SpriteBatch, font_text: BitmapFont) {
        sprite_batch.begin()
        Graphics.drawText(sprite_batch, font_text, text, (x + 360).toFloat(), (y + 630).toFloat())
        Graphics.drawSprite(sprite_batch, icon, (x + 360).toFloat(), (y + 270).toFloat(), Palette.LIGHT_GRAY)
        sprite_batch.end()
    }

    fun open(vision: Vision) {
        vision.screen = screen
    }
}
