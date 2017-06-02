package com.evh98.vision.ui

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.util.Graphics
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.evh98.vision.Vision
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20


class BigPane(val color: Color, val text: String, val x: Float, val y: Float) {

    val Vision = Vision()
    val Graphics = Graphics()

    var font = Graphics.createFont(Graphics.font_roboto_thin, 192);

    /**
     * Rendering of the main selected pane
     */
    fun renderSelect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        val gl = Gdx.graphics.gL20
        gl.glEnable(GL20.GL_BLEND)
        gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA)
        // Draw rectangle
        shape_renderer.begin(ShapeType.Filled)
        shape_renderer.setColor(242f, 242f, 242f, 0.9f)
        Graphics.drawRect(shape_renderer, x, y, 1536F, 768F)
        shape_renderer.end()
        gl.glDisable(GL20.GL_BLEND)
        // Draw outline
        gl.glLineWidth((3 * Vision.SCALE) as Float)
        shape_renderer.begin(ShapeType.Line)
        shape_renderer.color = color
        Graphics.drawRect(shape_renderer, x, y, 1536F, 768F)
        shape_renderer.end()
    }

    /**
     * Rendering of the main standard pane
     */
    fun renderUnselect(sprite_batch: SpriteBatch, shape_renderer: ShapeRenderer) {
        // Draw rectangle
        shape_renderer.begin(ShapeRenderer.ShapeType.Filled)
        shape_renderer.color = color
        Graphics.drawRect(shape_renderer, x, y, 1536F, 768F)
        shape_renderer.end()

    }
}