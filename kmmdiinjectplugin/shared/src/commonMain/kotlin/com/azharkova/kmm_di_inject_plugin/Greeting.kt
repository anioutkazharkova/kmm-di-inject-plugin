package com.azharkova.kmm_di_inject_plugin

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}