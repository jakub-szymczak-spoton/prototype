package com.example.prototype3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform