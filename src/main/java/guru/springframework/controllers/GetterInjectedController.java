package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {
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

    //    @Autowired
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    //@Qualifier("getterGreetingService") - can use here, or in method params with getter injection
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
