package com.kafka.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LoggerGroup;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service //makes this class a Spring Bean?
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    //this consume method now acts as a consumer and subscribes to the javaguides topic.
    //there could be many subscribers.
    @KafkaListener(topics = "javaguides", groupId = "myGroup") //this annotation to subscribe to the topic.
    public void consume(String message){
        LOGGER.info(String.format("Message received => %s", message));

    }

}
