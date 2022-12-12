package com.example.accountdomain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform