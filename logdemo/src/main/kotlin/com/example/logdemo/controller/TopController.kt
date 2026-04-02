package com.example.logdemo.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class TopController(
    @Value("app.name") private val appName: String
) {

    @GetMapping
    fun topPage(model: Model): String {
        model.addAttribute("appName", appName)
        return "index"
    }

    @GetMapping("/throw")
    fun errorPage(): String {
        throw RuntimeException("アクセスすると必ず例外をスローするページです。")
    }
}