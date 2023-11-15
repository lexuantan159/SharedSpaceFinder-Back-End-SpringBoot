package com.example.sharedspacefinder.controller;


import com.example.sharedspacefinder.dto.request.ContactForm;
import com.example.sharedspacefinder.services.email.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {

    @Autowired
    EmailServiceImpl emailServiceImpl;


    @GetMapping("/send-contact")
    public @ResponseBody ResponseEntity<?>  sendContact(ContactForm contactForm) {



        return null;
    }
}
