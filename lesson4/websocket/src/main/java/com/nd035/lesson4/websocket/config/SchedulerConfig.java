package com.nd035.lesson4.websocket.config;

import com.nd035.lesson4.websocket.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    @Scheduled(fixedDelay = 5000)
    public void sendAdhocMessages() {
        template.convertAndSend("/topic/user",
            new UserResponse("Scheduler"));
    }
}
