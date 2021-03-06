//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& CODE &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

package com.springPlay;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPlayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPlayApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }
}




//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& SCRATCH &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

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

