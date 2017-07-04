package com.evh98.vision.util

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Sprite

object Icons {

    var ACCOUNT: Sprite? = null
    var APPS: Sprite? = null
    var BACK: Sprite? = null
    var BULB: Sprite? = null
    var COLLECTIONS: Sprite? = null
    var CONFIRM: Sprite? = null
    var FACEBOOK: Sprite? = null
    var FEEDBACK: Sprite? = null
    var FOLDER: Sprite? = null
    var GAMES: Sprite? = null
    var INFO: Sprite? = null
    var MEDIA: Sprite? = null
    var MOVIES: Sprite? = null
    var MUSIC: Sprite? = null
    var NETFLIX: Sprite? = null
    var PHONE: Sprite? = null
    var PLEX: Sprite? = null
    var SEARCH: Sprite? = null
    var SETTINGS: Sprite? = null
    var SPOTIFY: Sprite? = null
    var TV_GUIDE: Sprite? = null
    var TWITTER: Sprite? = null
    var WHATSAPP: Sprite? = null
    var WWE: Sprite? = null
    var YOUTUBE: Sprite? = null

    fun loadAll() {
        ACCOUNT = Graphics.createSprite(Gdx.files.internal("icons/account.png"))
        APPS = Graphics.createSprite(Gdx.files.internal("icons/apps.png"))
        BACK = Graphics.createSprite(Gdx.files.internal("icons/back.png"))
        BULB = Graphics.createSprite(Gdx.files.internal("icons/bulb.png"))
        COLLECTIONS = Graphics.createSprite(Gdx.files.internal("icons/collections.png"))
        CONFIRM = Graphics.createSprite(Gdx.files.internal("icons/confirm.png"))
        FACEBOOK = Graphics.createSprite(Gdx.files.internal("icons/facebook.png"))
        FEEDBACK = Graphics.createSprite(Gdx.files.internal("icons/feedback.png"))
        FOLDER = Graphics.createSprite(Gdx.files.internal("icons/folder.png"))
        GAMES = Graphics.createSprite(Gdx.files.internal("icons/games.png"))
        INFO = Graphics.createSprite(Gdx.files.internal("icons/info.png"))
        MEDIA = Graphics.createSprite(Gdx.files.internal("icons/media.png"))
        MOVIES = Graphics.createSprite(Gdx.files.internal("icons/movies.png"))
        MUSIC = Graphics.createSprite(Gdx.files.internal("icons/music.png"))
        NETFLIX = Graphics.createSprite(Gdx.files.internal("icons/netflix.png"))
        PHONE = Graphics.createSprite(Gdx.files.internal("icons/phone.png"))
        PLEX = Graphics.createSprite(Gdx.files.internal("icons/plex.png"))
        SEARCH = Graphics.createSprite(Gdx.files.internal("icons/search.png"))
        SETTINGS = Graphics.createSprite(Gdx.files.internal("icons/settings.png"))
        SPOTIFY = Graphics.createSprite(Gdx.files.internal("icons/spotify.png"))
        TV_GUIDE = Graphics.createSprite(Gdx.files.internal("icons/tv_guide.png"))
        TWITTER = Graphics.createSprite(Gdx.files.internal("icons/twitter.png"))
        WHATSAPP = Graphics.createSprite(Gdx.files.internal("icons/whatsapp.png"))
        WWE = Graphics.createSprite(Gdx.files.internal("icons/wwe.png"))
        YOUTUBE = Graphics.createSprite(Gdx.files.internal("icons/youtube.png"))
    }

}