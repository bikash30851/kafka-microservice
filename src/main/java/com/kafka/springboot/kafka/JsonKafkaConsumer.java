package com.kafka.springboot.kafka;

import com.kafka.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    //Spring Kafka provided JsonDeserializer will convert the JSON object received from the Producer->Topic-> into
    //a java object which is being logged in a String format using the toString() method.
    @KafkaListener(topics = "javaguides_json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message Received -> %s", user.toString()));
    }

}
