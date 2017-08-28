package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
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

    @Autowired // not required when using Constructor-based DI as is the case below
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
