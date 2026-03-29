package com.example.logdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class TopController {
    @GetMapping
    fun topPage(): String {
        return "index"
    }

    @GetMapping("/throw")
    fun errorPage(): String {
        throw RuntimeException("アクセスすると必ず例外をスローするページです。")
    }
}