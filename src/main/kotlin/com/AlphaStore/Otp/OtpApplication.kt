package com.AlphaStore.Otp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
class OtpApplication

fun main(args: Array<String>) {
    runApplication<OtpApplication>(*args)
}
