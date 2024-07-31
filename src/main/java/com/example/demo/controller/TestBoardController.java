package com.example.demo.controller;

import com.example.demo.entity.TestBoard;
import com.example.demo.service.TestBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestBoardController {

    @Autowired
    private TestBoardService testBoardService;

    @GetMapping("/testBoard")
    public List<TestBoard> getAllTestBoards() {
        return testBoardService.findAll();
    }
}
