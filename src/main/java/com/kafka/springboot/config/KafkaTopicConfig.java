package com.kafka.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration //This annotation will make this class act as a java spring configuration class.
public class KafkaTopicConfig {


    //creating a kafka topic
    @Bean //this method will act as bean for String messages.
    public NewTopic javaGuidesTopic(){
        return TopicBuilder.name("javaguides") //javaguides is the topic name here
                .build();
    }


    //JsonKafkaProducer will send message to this topic whose name is javaguides_json
    @Bean //this method will act as bean for Json messages.
    public NewTopic javaGuidesJsonTopic(){
        return TopicBuilder.name("javaguides_json") //javaguides json is the topic here
                .build();
    }

}
