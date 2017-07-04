package com.evh98.vision.util

import java.io.IOException
import java.net.MalformedURLException
import java.net.URL


object Util {

    fun isNetworkAvailable(): Boolean {
        try {
            val url = URL("http://www.google.com")
            val conn = url.openConnection()
            conn.connect()
            return true
        } catch (e: MalformedURLException) {
            throw RuntimeException(e)
        } catch (e: IOException) {
            return false
        }

    }

}