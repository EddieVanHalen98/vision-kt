package com.evh98.vision.util

import com.badlogic.gdx.graphics.g2d.GlyphLayout
import com.badlogic.gdx.graphics.g2d.ParticleEffect
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.Gdx
import com.evh98.vision.Vision
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.Texture.TextureFilter
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter
import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType.ANCHOR
import com.badlogic.gdx.graphics.glutils.ShapeRenderer

class Graphics {

    val Vision = Vision()

    var font_roboto_thin = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-thin.ttf"))
    var font_roboto_light = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-light.ttf"))
    var font_roboto_bold = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-bold.ttf"))

    var splash: Sprite? = null
    var lockscreen: Sprite? = null
    var default_movie: Sprite? = null
    var default_game: Sprite? = null
    var default_manage: Sprite? = null
    var default_add: Sprite? = null

    var particles: ParticleEffect? = null

    var glyph_layout: GlyphLayout? = null

    /*
     * Load all graphics
     */
    fun loadAll() {
        loadSprites()
        //LoadParticles()

        glyph_layout = GlyphLayout()
    }

    /**
     * Internal textures loading method
     */
    private fun loadSprites() {

    }

    /**
     * Internal particles loading method

    private fun loadParticles() {
        particles = ParticleEffect()
        particles.load(Gdx.files.internal("particles/particles.p"), Gdx.files.internal("particles/"))
        particles.setPosition((1920 * Vision.SCALE) as Float, (1080 * Vision.SCALE) as Float)
        particles.scaleEffect(Vision.SCALE)
    }
     **/

    /**
     * Creates a BitmapFont from a FreeTypeFont with a specified size
     */
    fun createFont(type: FreeTypeFontGenerator, size: Int): BitmapFont {
        val param = FreeTypeFontParameter()
        param.size = size * Vision.SCALE
        param.color = Palette.LIGHT_GRAY
        param.flip = true
        val font = type.generateFont(param)
        font.region.texture.setFilter(TextureFilter.Linear, TextureFilter.Linear)
        return font
    }

    /**
     * Creates a sprite with custom properties
     */
    fun createSprite(path: FileHandle): Sprite {
        val t = Texture(path)
        t.setFilter(TextureFilter.Linear, TextureFilter.Linear)
        val s = Sprite(t)
        s.flip(false, true)
        return s
    }

    /**
     * Responsible for drawing the splash sprite
     */
    fun drawSplash(sprite_batch: SpriteBatch) {
        sprite_batch.begin()
        sprite_batch.draw(splash, 0.0F, 0.0F, Vision.WIDTH, Vision.HEIGHT)
        sprite_batch.end()
    }

    /**
     * Draws a rectangle under Vision scaling relative to the global anchor point
     */
    fun drawRect(shape_renderer: ShapeRenderer, x: Float, y: Float, width: Float, height: Float) {
        shape_renderer.rect(x * Vision.SCALE, y * Vision.SCALE, width * Vision.SCALE, height * Vision.SCALE)
    }
}