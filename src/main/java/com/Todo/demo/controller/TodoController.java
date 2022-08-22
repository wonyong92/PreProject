package com.Todo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public ResponseEntity main (){

        return new ResponseEntity("To-do Application !",HttpStatus.OK);
    }
}
