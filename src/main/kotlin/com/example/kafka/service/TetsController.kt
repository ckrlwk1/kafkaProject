package com.example.kafka.service

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//import  org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka")
class TetsController(private val kafkaTemplate: KafkaTemplate<String, String>) {

    @PostMapping("/send")
    fun sendMessage(@RequestBody message: String) {
        // Kafka 토픽 이름을 "my-topic"으로 가정합니다.
        val topic = "my-topic"

        kafkaTemplate.send(topic, message)
        println("Message sent to Kafka topic: $topic, Message: $message")
    }
}

