package com.example.protorype5

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform