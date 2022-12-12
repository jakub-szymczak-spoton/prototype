package com.example.prototype4

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform