package com.evh98.vision.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.evh98.vision.Vision
import com.evh98.vision.util.Graphics

class SplashScreen(vision: Vision) : VisionScreen(vision) {

    override fun show() {
        Graphics.splash = Graphics.createSprite(Gdx.files.internal("splash.png"));
    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0.95F, 0.95F, 0.95F, 1F)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        camera.update();

        sprite_batch.setProjectionMatrix(camera.combined);
        shape_renderer.setProjectionMatrix(camera.combined);

        Graphics.drawSplash(sprite_batch);

        object : Thread() {
            override fun run() {
                Gdx.app.postRunnable { init() }
            }
        }.start()
    }

    private fun init() {
        initServer()
        initAssets()
        initObjects()
        initScreens()

        vision.screen = vision.home_screen
    }

    private fun initServer() {

    }

    private fun initAssets() {
        Graphics.loadAll()
    }

    private fun initObjects() {

    }

    private fun initScreens() {
        vision.home_screen = HomeScreen(vision)
    }
}