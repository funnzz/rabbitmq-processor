package com.homeprj.rabbitmqprocessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RabbitmqProcessorApplication

fun main(args: Array<String>) {
	runApplication<RabbitmqProcessorApplication>(*args)
}
