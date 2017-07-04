package com.evh98.vision.models

import com.eclipsesource.json.Json
import java.io.FileReader

object Models {

    val games = mutableListOf<Game>()

    fun loadGames() {
        val jsonRoot = Json.parse(FileReader(System.getProperty("user.home") + "/Documents/games.json"))
        val jsonGameValues = jsonRoot.asObject().get("games").asArray()

        for (gameValue in jsonGameValues) {
            val game = Game(title = gameValue.asObject().get("title").asString(),
                            iconUrl = gameValue.asObject().get("iconUrl").asString(),
                            filePath = gameValue.asObject().get("filePath").asString())

            games.add(game)
        }
    }
}