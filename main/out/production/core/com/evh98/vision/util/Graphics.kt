package com.evh98.vision.util

import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator
import com.badlogic.gdx.Gdx
import com.evh98.vision.Vision
import com.badlogic.gdx.graphics.Texture.TextureFilter
import com.badlogic.gdx.files.FileHandle
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.*
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch

object Graphics {

    val Vision = Vision()

    var font_roboto_thin = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-thin.ttf"))
    var font_roboto_light = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-light.ttf"))
    var font_roboto_bold = FreeTypeFontGenerator(Gdx.files.internal("fonts/roboto-bold.ttf"))
    var font_product_sans = FreeTypeFontGenerator(Gdx.files.internal("fonts/productsans.ttf"))

    var splash: Sprite? = null
    var lockscreen: Sprite? = null
    var default_movie: Sprite? = null
    var default_game: Sprite? = null
    var default_manage: Sprite? = null
    var default_add: Sprite? = null

    var particles = ParticleEffect()

    var glyph_layout = GlyphLayout()

    /*
     * Load all graphics
     */
    fun loadAll() {
        loadSprites()
        loadParticles()
    }

    /**
     * Internal textures loading method
     */
    private fun loadSprites() {
        Icons.loadAll()
    }

    /**
     * Internal particles loading method
     */
    private fun loadParticles() {
        particles = ParticleEffect()
        particles.load(Gdx.files.internal("particles/particles.p"), Gdx.files.internal("particles/"))
        particles.setPosition(1920 * Vision.SCALE, 1080 * Vision.SCALE)
        particles.scaleEffect(Vision.SCALE)
    }

    /**
     * Changes the emitter of the particles to the specified color
     */
    fun setParticles(color: Color) {
        val colors = FloatArray(3)

        if (color === Palette.WHITE) {
            particles.load(Gdx.files.internal("particles/particles.p"), Gdx.files.internal("particles/"))
            particles.setPosition(1920 * Vision.SCALE, 1080 * Vision.SCALE)
            particles.scaleEffect(Vision.SCALE)
        } else {
            colors[0] = color.r
            colors[1] = color.g
            colors[2] = color.b

            for (i in 0..3) {
                particles.emitters.get(i).tint.colors = colors
            }
        }
    }

    /**
     * Creates a BitmapFont from a FreeTypeFont with a specified size
     */
    fun createFont(type: FreeTypeFontGenerator, size: Int): BitmapFont {
        val param = FreeTypeFontParameter()
        param.size = (size * Vision.SCALE).toInt()
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

    /**
     * Draws text using relative to the global anchor point
     */
    fun drawText(sprite_batch: SpriteBatch, font: BitmapFont, text: String, x: Float, y: Float) {
        glyph_layout.setText(font, text)
        val cx = x - glyph_layout.width / Vision.SCALE / 2
        val cy = y - glyph_layout.height / Vision.SCALE / 2
        font.draw(sprite_batch, glyph_layout, cx * Vision.SCALE, cy * Vision.SCALE)
    }

    /**
     * Draws a sprite under Vision scaling
     */
    fun drawSprite(sprite_batch: SpriteBatch, sprite: Sprite, x: Float, y: Float) {
        sprite_batch.draw(sprite, x * Vision.SCALE, y * Vision.SCALE)
    }

    /**
     * Draws a sprite under Vision scaling with a specified color
     */
    fun drawSprite(sprite_batch: SpriteBatch, sprite: Sprite, x: Float, y: Float, color: Color) {
        val original = sprite_batch.color
        sprite_batch.color = color
        sprite_batch.draw(sprite, (x - (sprite.width / 2)) * Vision.SCALE, (y - (sprite.height / 2)) * Vision.SCALE,
                sprite.width * Vision.SCALE, sprite.height * Vision.SCALE)
        sprite_batch.color = original
    }

    /**
     * Draws a sprite with a specified size under Vision scaling with a specified color
     */
    fun drawSprite(sprite_batch: SpriteBatch, sprite: Sprite, x: Float, y: Float, width: Float, height: Float, color: Color) {
        val original = sprite_batch.color
        sprite_batch.color = color
        sprite_batch.draw(sprite, x * Vision.SCALE, y * Vision.SCALE, width * Vision.SCALE, height * Vision.SCALE)
        sprite_batch.color = original
    }

    /**
     * Draws a sprite with a specified size under Vision scaling
     */
    fun drawSprite(sprite_batch: SpriteBatch, sprite: Sprite, x: Float, y: Float, width: Float, height: Float) {
        sprite_batch.draw(sprite, x * Vision.SCALE, y * Vision.SCALE, width * Vision.SCALE, height * Vision.SCALE)
    }
}