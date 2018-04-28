

//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& CODE &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

package com.springPlay;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springPlay.SpringPlayServices.*;

@RestController
public class SpringPlayREST {
    @RequestMapping("/")
    public String hello() {
        System.out.println("Inside / endpt");
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/add")
    public String add() {
        System.out.println("Inside /add endpt");
        SpringPlayServices services = new SpringPlayServices();
        int value = services.adder(3, 4);
        String returnString = "value of adder: "+value;
        return returnString;
        // return "Greetings from Spring Boot!";
    }
    @RequestMapping("/message")
    public String message() {
        System.out.println("Inside /message endpt");
        return "Greetings from Spring Boot!";
    }
    
}




//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& SCRATCH &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&



//POST REQUEST EXAMPLE
// -------------------Create a User-------------------------------------------

// @RequestMapping(value = "/user/", method = RequestMethod.POST)
// public ResponseEntity<?> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
//     logger.info("Creating User : {}", user);

//     if (userService.isUserExist(user)) {
//         logger.error("Unable to create. A User with name {} already exist", user.getName());
//         return new ResponseEntity(new CustomErrorType("Unable to create. A User with name " + 
//         user.getName() + " already exist."),HttpStatus.CONFLICT);
//     }
//     userService.saveUser(user);

//     HttpHeaders headers = new HttpHeaders();
//     headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(user.getId()).toUri());
//     return new ResponseEntity<String>(headers, HttpStatus.CREATED);
// }
 

//INITIALIZED W/THIS PROJECT

// package hdepot.com.springPlay;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @SpringBootApplication
// public class SpringPlayApplication {
// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringPlayApplication.class, args);
// 	}
// }


//REST CONTROLLER

// package hello;

// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RestController
// public class HelloController {

//     @RequestMapping("/")
//     public String index() {
//         return "Greetings from Spring Boot!";
//     }

// }


//APPLICATION CLASS

// package hello;

// import java.util.Arrays;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.Bean;

// @SpringBootApplication
// public class Application {

//     public static void main(String[] args) {
//         SpringApplication.run(Application.class, args);
//     }

//     @Bean
//     public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//         return args -> {

//             System.out.println("Let's inspect the beans provided by Spring Boot:");

//             String[] beanNames = ctx.getBeanDefinitionNames();
//             Arrays.sort(beanNames);
//             for (String beanName : beanNames) {
//                 System.out.println(beanName);
//             }

//         };
//     }

// }

