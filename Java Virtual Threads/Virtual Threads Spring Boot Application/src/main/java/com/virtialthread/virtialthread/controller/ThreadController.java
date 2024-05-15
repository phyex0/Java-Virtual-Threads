package com.virtialthread.virtialthread.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThreadController {

    @GetMapping(value = "/get-thread")
    public ResponseEntity<String> getThreadName() throws InterruptedException {
        Thread.sleep(1000);
        return ResponseEntity.ok(Thread.currentThread().toString());
    }
}
