package com.example.logdemo

import org.slf4j.MDC
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class LogdemoApplication

fun main(args: Array<String>) {
    val uuid = UUID.randomUUID().toString()
    MDC.put("labels.job_id", uuid)
    runApplication<LogdemoApplication>(*args)
}
