package com.alpha.test_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform