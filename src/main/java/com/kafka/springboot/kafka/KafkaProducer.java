package com.kafka.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    //Springboot provided default logger to log the message
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    //use this logger instance to log the message


    //Springboot provides autoconfiguration for kafkaTemplate. If not using springboot then need to perform the configuration
    //ourselves
    private KafkaTemplate<String, String> kafkaTemplate;


    //Creating a constructor to perform constructor based dependency injection.
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //creating a method that uses kafka template to send messages.
    public void sendMessage(String message){
        LOGGER.info(String.format("Message Sent %s", message));
        kafkaTemplate.send("javaguides", message);

    }
}

//We have created Kafka Producer which uses Kafka Template to send message to the topic
//The name of the topic is "javaguides".