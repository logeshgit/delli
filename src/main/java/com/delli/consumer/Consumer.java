package com.delli.consumer;

import com.delli.consumer.bean.MailBean;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer {

    private static final String TOPIC_NAME = "machine1";

    @KafkaListener(topics = TOPIC_NAME)
    public void consume(String message) throws IOException {
        System.out.println("Received Message: " + message);
        ObjectMapper mapper = new ObjectMapper();
        MailBean mailBean=mapper.readValue(message, MailBean.class);

        if(mailBean.isHasAttachment()){
           copyAttachmentToFileServer(mailBean);
        }

        notifyDownStreamSystem(mailBean);


    }

    private boolean notifyDownStreamSystem(MailBean mailBean){
        //TODO: process goes here
        return true;
    }

    private boolean copyAttachmentToFileServer(MailBean mailBean){
        //TODO: process goes here
        return true;
    }
}
