package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    // Don't do this with the impl, use the interface!!!
//    private GreetingServiceImpl greetingService;
//
//    public String sayHello(){
//        return greetingService.sayGreeting();
//    }
//
//    public void setGreetingService(GreetingServiceImpl greetingService) {
//        this.greetingService = greetingService;
//    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Autowired
    private GreetingService greetingService;
}
