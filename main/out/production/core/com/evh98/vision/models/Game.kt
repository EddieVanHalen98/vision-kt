package com.evh98.vision.models

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.Gdx
import org.apache.commons.io.FileUtils
import java.io.IOException
import java.io.File
import java.net.URL

import com.evh98.vision.util.Graphics
import com.evh98.vision.util.Util
import java.awt.Desktop

class Game(val title: String, val iconUrl: String, val filePath: String) {

    var icon: Sprite? = null

    init {
        downloadIcon()
    }

    private fun downloadIcon() {
        val f = File(System.getProperty("user.home") + "/Vision/assets/posters/" + title + ".png")

        if (!f.exists() && Util.isNetworkAvailable()) {
            try {
                FileUtils.copyURLToFile(URL(iconUrl), f)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        if (f.exists()) {
            icon = Graphics.createSprite(Gdx.files.absolute(f.path.toString()))
        } else {
            // TODO: Fallback
        }
    }

    fun open() {
        Desktop.getDesktop().open(File(filePath))
    }
}