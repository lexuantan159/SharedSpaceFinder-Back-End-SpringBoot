package com.example.sharedspacefinder;

import com.example.sharedspacefinder.services.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SharedSpaceFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedSpaceFinderApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
//            // add default roles
//            userService.saveRole(new Role("R1","Admin"));
//            userService.saveRole(new Role("R2","Owner"));
//            userService.saveRole(new Role("R3","User"));
//
//            //
//            userService.saveUser(new User(1, "Lê Xuân Tân", true, "09235234324","lexuantan@gmail.com", "111111", "Đà Nẵng", "Quận Liên Chiểu", "Phường Hòa Minh", "12 Tô Hieu", new HashSet<>()));
//            userService.saveUser(new User(2, "Trần Quang Luận", true, "09235234324","tranquangluan@gmail.com", "111111", "Đà Nẵng", "Quận Liên Chiểu", "Phường Hòa Minh", "12 Tô Hieu", new HashSet<>()));
//            userService.saveUser(new User(3, "Lê Xuân Hoàng", true, "09235234324","lexuanhoang@gmail.com", "111111", "Đà Nẵng", "Quận Liên Chiểu", "Phường Hòa Minh", "12 Tô Hieu", new HashSet<>()));
//
//            //
//            userService.addToUser("lexuantan@gmail.com" , "R1");
//            userService.addToUser("tranquangluan@gmail.com" , "R3");
//            userService.addToUser("lexuanhoang@gmail.com" , "R3");
        };
    }
}
