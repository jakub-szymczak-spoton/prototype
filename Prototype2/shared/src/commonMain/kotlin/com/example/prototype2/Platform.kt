package com.example.prototype2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform