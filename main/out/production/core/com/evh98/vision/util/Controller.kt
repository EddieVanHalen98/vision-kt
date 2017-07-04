package com.evh98.vision.util

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input

object Controller {

    fun isGreen() = Gdx.input.isKeyJustPressed(Input.Keys.E) || Gdx.input.isKeyJustPressed(Input.Keys.SPACE) || Gdx.input.isKeyJustPressed(Input.Keys.ENTER)
    fun isRed() = Gdx.input.isKeyJustPressed(Input.Keys.R) || Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE) || Gdx.input.isKeyJustPressed(Input.Keys.BACKSPACE)
    fun isBlue() = Gdx.input.isKeyJustPressed(Input.Keys.F)
    fun isYellow() = Gdx.input.isKeyJustPressed(Input.Keys.Q)
    fun isSearch() = Gdx.input.isKeyJustPressed(Input.Keys.TAB)

    fun isUp() = Gdx.input.isKeyJustPressed(Input.Keys.W) || Gdx.input.isKeyJustPressed(Input.Keys.UP)
    fun isDown() = Gdx.input.isKeyJustPressed(Input.Keys.S) || Gdx.input.isKeyJustPressed(Input.Keys.DOWN)
    fun isRight() = Gdx.input.isKeyJustPressed(Input.Keys.D) || Gdx.input.isKeyJustPressed(Input.Keys.RIGHT)
    fun isLeft() = Gdx.input.isKeyJustPressed(Input.Keys.A) || Gdx.input.isKeyJustPressed(Input.Keys.LEFT)
    fun isNavigationKey() = isUp() || isDown() || isRight() || isLeft()

    fun isAnyKey() = isGreen() || isRed() || isBlue() || isYellow() || isUp() || isDown() || isRight() || isLeft() || isSearch()

    fun isSpace() = Gdx.input.isKeyJustPressed(Input.Keys.SPACE)
    fun isBackspace() = Gdx.input.isKeyJustPressed(Input.Keys.BACKSPACE)
    fun isEnter() = Gdx.input.isKeyJustPressed(Input.Keys.ENTER)

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

    /**
     * get coordinates of new selected pane based on key event and current selected pane
     */
    fun getNewXY(x: Int, y: Int, columns: Int, rows: Int, totalItems: Int): IntArray {
        var x = x
        var y = y

        if (x == -1 && y == -1) return intArrayOf(1, 1)
        if (x == -1) x = 0
        if (y == -1) y = 0

        if (isLeft()) x--
        if (isDown()) y++
        if (isRight()) x++
        if (isUp()) y--

        if (x > columns) {
            y++
            x = 1
        }
        if (y > rows) y = 1
        if (x == 0) {
            x = columns
            y--
        }
        if (y == 0) y = rows

        val leftOver = totalItems % columns

        if (leftOver != 0 && x > leftOver && y == rows) {
            //the selected item doesn't exist. So just do whatever we were again until it does
            return getNewXY(x, y, columns, rows, totalItems)
        }

        return intArrayOf(x, y)
    }
}