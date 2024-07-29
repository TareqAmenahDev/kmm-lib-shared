package com.alpha.test_test

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}

class Calculator {

    fun add(x:Int, y:Int): Int {
        return x + y
    }

    fun subtract(x:Int, y:Int): Int {
        return x - y
    }

    fun multiply(x:Int, y:Int): Int {
        return x * y
    }

    fun divide(x:Int, y:Int): Int {
        return x / y
    }

}

fun hiCalculate(): Int{

    return 4

}