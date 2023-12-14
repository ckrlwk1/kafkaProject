package com.example.kafka.service

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import org.springframework.kafka.core.KafkaTemplate

@Service
class KafkaConsumerService {

    @KafkaListener(topics = ["testTopic"], groupId = "my-group")
    fun receiveMessage(message: String) {
        println("Received message from Kafka: $message")
    }
}