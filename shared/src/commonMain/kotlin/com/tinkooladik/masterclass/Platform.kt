package com.tinkooladik.masterclass

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform