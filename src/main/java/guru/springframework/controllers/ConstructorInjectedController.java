package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

public class ConstructorInjectedController {

    // Use the impl!!!
//    private GreetingServiceImpl greetingService;
//
//    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    public String sayHello(){
//        return greetingService.sayGreeting();
//    }

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
