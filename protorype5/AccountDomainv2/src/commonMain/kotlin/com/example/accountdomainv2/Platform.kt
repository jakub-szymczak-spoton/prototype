package com.example.accountdomainv2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform