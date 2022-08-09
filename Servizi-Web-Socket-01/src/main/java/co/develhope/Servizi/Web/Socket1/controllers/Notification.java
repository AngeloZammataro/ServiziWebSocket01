package co.develhope.Servizi.Web.Socket1.controllers;

import co.develhope.Servizi.Web.Socket1.entities.MessageDTO;
import co.develhope.Servizi.Web.Socket1.entities.MessageFromClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Notification {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/broadcast-message")
    public ResponseEntity sendNotificationToClients(@RequestBody MessageDTO message){
        simpMessagingTemplate.convertAndSend("/topic/messages",message);
        return  ResponseEntity.status(HttpStatus.OK).build();
    }

    @MessageMapping("/hello")
    @SendTo("/topic/messages")
    public MessageDTO handleMessageFromWebSocket(MessageFromClientDTO message){
        System.out.println("Arrived something on /app/hello - " + message.toString());
        return new MessageDTO("message from client " + message.getFrom() , " - " + message.getText());
    }
}
