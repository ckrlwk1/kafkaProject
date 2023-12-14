package com.example.kafka.service

import org.springframework.stereotype.Service
import org.springframework.kafka.core.KafkaTemplate

@Service
class KafkaProducerService(private val kafkaTemplate: KafkaTemplate<String, String>) {

    fun sendMessage(topic: String, message: String) {
        kafkaTemplate.send(topic, message)
        println("Message sent to Kafka topic: $topic")
    }
}