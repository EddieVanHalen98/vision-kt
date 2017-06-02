package com.evh98.vision.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.evh98.vision.Vision
import com.evh98.vision.util.Graphics

open class VisionScreen(val vision: Vision) : Screen {

    val Graphics = Graphics()

    var camera = OrthographicCamera()
    var sprite_batch = SpriteBatch()
    var shape_renderer = ShapeRenderer()

    init {
        camera.setToOrtho(true, vision.WIDTH, vision.HEIGHT)
    }

    override fun show() {

    }

    fun start(color: Color) {
        Graphics.setParticles(color);
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0.95F, 0.95F, 0.95F, 1F)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        camera.update()

        sprite_batch.projectionMatrix = camera.combined
        shape_renderer.projectionMatrix = camera.combined

        sprite_batch.begin()
            Graphics.particles.draw(sprite_batch, delta);
        sprite_batch.end()

        draw(delta)

        update()
    }

    open fun draw(delta: Float) {

    }

    open fun update() {

    }

    override fun dispose() {
        sprite_batch.dispose()
        shape_renderer.dispose()
    }

    override fun hide() {}
    override fun pause() {}
    override fun resume() {}
    override fun resize(width: Int, height: Int) {}
}