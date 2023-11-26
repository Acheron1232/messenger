package ua.acheron.messenger.web.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ua.acheron.messenger.Message;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @GetMapping
    public String mainPage(){
        return "index";
    }


    @MessageMapping("/app/send_message")
    @SendTo("/topic/public")
    public Message getMessage(@Payload Message s){
        return s;
    }
    @MessageMapping("/app/send_username")
    @SendTo("/topic/public")
    public Message getUsername(@Payload String s){
        System.out.println(s);
        return Message.builder().sender(s).content("Add user "+ s).build();
    }
}
