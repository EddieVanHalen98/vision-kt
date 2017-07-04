package com.evh98.vision.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.util.Graphics
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.evh98.vision.Vision
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.g2d.Sprite
import com.evh98.vision.util.Palette


class BigPane(val color: Color, val text: String, val icon: Sprite, val x: Float, val y: Float) {

    val Vision = Vision()

    var font = Graphics.createFont(Graphics.font_roboto_thin, 192);

    /**
     * Rendering of the main standard pane
     */
    fun renderUnselect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        drawRectangle(shape_renderer, selected = false, color = color)
        drawTitle(sprite_batch, color = Palette.LIGHT_GRAY)
        drawIcon(sprite_batch, color = Palette.LIGHT_GRAY)
    }

    /**
     * Rendering of the main selected pane
     */
    fun renderSelect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        drawRectangle(shape_renderer, selected = true, color = Color(242f, 242f, 242f, 0.9f))
        drawTitle(sprite_batch, color)
        drawIcon(sprite_batch, color)
    }

    private fun drawRectangle(shape_renderer: ShapeRenderer, selected: Boolean, color: Color) {
        // Sets opacity
        val gl = Gdx.graphics.gL20
        if (selected) {
            gl.glEnable(GL20.GL_BLEND)
            gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        }

        shape_renderer.begin(ShapeType.Filled)
        shape_renderer.color = color
        Graphics.drawRect(shape_renderer, x, y, width = 1536F, height = 768F)
        shape_renderer.end()

        // Draws outline
        if (selected) {
            gl.glDisable(GL20.GL_BLEND)
            gl.glLineWidth((3 * Vision.SCALE) as Float)
            shape_renderer.begin(ShapeType.Line)
            shape_renderer.color = this.color
            Graphics.drawRect(shape_renderer, x, y, width = 1536F, height = 768F)
            shape_renderer.end()
        }
    }

    private fun drawTitle(sprite_batch: SpriteBatch, color: Color) {
        sprite_batch.begin();
        font.color = color
        Graphics.drawText(sprite_batch, font, text, x + 768, y + 532);
    }

    private fun drawIcon(sprite_batch: SpriteBatch, color: Color) {
        Graphics.drawSprite(sprite_batch, icon, x + 768, y + 232, color);
        sprite_batch.end();
    }
}