package ru.otus.DockerHomework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/health")
public class HealthController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> health() {
        return Collections.singletonMap("status", "OK");
    }
}
