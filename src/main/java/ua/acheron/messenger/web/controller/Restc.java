package ua.acheron.messenger.web.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restc {

    @GetMapping("/session")
    public String mainPage1(HttpSession session){
        session.setAttribute("Name","adsda");
        return "session";
    }
    @GetMapping("/sessionget")
    public String mainPage2(HttpSession session){

        System.out.println(session.getAttribute("Name"));
        return "session";
    }
}
