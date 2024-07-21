package com.example.nguyendq.userws.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class UsersController {
    @CrossOrigin(origins = "*")
    @GetMapping("/users")
    public List<String> getBikes() throws Exception {
        log.info("Getting users from server: {}", InetAddress.getLocalHost().getHostName());

        return Arrays.asList("user1", "user2");
    }
}
