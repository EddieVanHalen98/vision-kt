package com.evh98.vision.util

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input

object Controller {

    /*
	 * Checks if any of the applicable Vision 'Green' keys have been detected
	 */
    fun isGreen(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.E) || Gdx.input.isKeyJustPressed(Input.Keys.SPACE) || Gdx.input.isKeyJustPressed(Input.Keys.ENTER)
    }

    /*
	 * Checks if any of the applicable Vision 'Red' keys have been detected
	 */
    fun isRed(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.R) || Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE) || Gdx.input.isKeyJustPressed(Input.Keys.BACKSPACE)
    }

    /*
	 * Checks if any of the applicable Vision 'Blue' keys have been detected
	 */
    fun isBlue(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.F)
    }

    /*
	 * Checks if any of the applicable Vision 'Yellow' keys have been detected
	 */
    fun isYellow(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.Q)
    }

    /*
	 * Checks if any of the applicable Vision 'Up' keys have been detected
	 */
    fun isUp(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.W) || Gdx.input.isKeyJustPressed(Input.Keys.UP)
    }

    /*
	 * Checks if any of the applicable Vision 'Down' keys have been detected
	 */
    fun isDown(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.S) || Gdx.input.isKeyJustPressed(Input.Keys.DOWN)
    }

    /*
	 * Checks if any of the applicable Vision 'Right' keys have been detected
	 */
    fun isRight(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.D) || Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)
    }

    /*
	 * Checks if any of the applicable Vision 'Left' keys have been detected
	 */
    fun isLeft(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.A) || Gdx.input.isKeyJustPressed(Input.Keys.LEFT)
    }

    /*
	 * Checks if any of the applicable Vision 'Search' keys have been detected
	 */
    fun isSearch(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.TAB)
    }

    /*
	 * Checks if any of the applicable Vision navigation keys have been detected
	 */
    fun isNavigationKey(): Boolean {
        return isUp() || isDown() || isRight() || isLeft()
    }

    /*
	 * Checks if any of the applicable Vision keys have been detected
	 */
    fun isAnyKey(): Boolean {
        return isGreen() || isRed() || isBlue() || isYellow() || isUp() ||
                isDown() || isRight() || isLeft() || isSearch()
    }

    /*
	 * Checks if the space character is entered
	 */
    fun isSpace(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.SPACE)
    }

    /*
	 * Checks if the backspace character is entered
	 */
    fun isBackspace(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.BACKSPACE)
    }

    /*
	 * Checks if the enter character is entered
	 */
    fun isEnter(): Boolean {
        return Gdx.input.isKeyJustPressed(Input.Keys.ENTER)
    }

    /*
	 * Checks what letter character is entered
	 */
    fun letterPressed(): String {
        if (Gdx.input.isKeyJustPressed(Input.Keys.A)) {
            return "a"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.B)) {
            return "b"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.C)) {
            return "c"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.D)) {
            return "d"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.E)) {
            return "e"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.F)) {
            return "f"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.G)) {
            return "g"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.H)) {
            return "h"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.I)) {
            return "i"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.J)) {
            return "j"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.K)) {
            return "k"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.L)) {
            return "l"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.M)) {
            return "m"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.N)) {
            return "n"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.O)) {
            return "o"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.P)) {
            return "p"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.Q)) {
            return "q"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.R)) {
            return "r"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.S)) {
            return "s"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.T)) {
            return "t"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.U)) {
            return "u"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.V)) {
            return "v"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.W)) {
            return "w"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.X)) {
            return "x"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.Y)) {
            return "y"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) {
            return "z"
        } else {
            return "/"
        }
    }

    /*
	 * Checks what numerical character is entered
	 */
    fun digitPressed(): String {
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_0) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_0)) {
            return "0"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_1)) {
            return "1"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_2)) {
            return "2"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_3)) {
            return "3"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_4) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_4)) {
            return "4"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_5) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_5)) {
            return "5"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_6) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_6)) {
            return "6"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_7) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_7)) {
            return "7"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_8) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_8)) {
            return "8"
        } else if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_9) || Gdx.input.isKeyJustPressed(Input.Keys.NUMPAD_9)) {
            return "9"
        } else {
            return "/"
        }
    }

}