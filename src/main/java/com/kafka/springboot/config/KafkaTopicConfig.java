package com.kafka.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration //This annotation will make this class act as a java spring configuration class.
public class KafkaTopicConfig {


    //creating a kafka topic
    @Bean //this method will act as bean.
    public NewTopic javaGuidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }

}
