package com.example.demo.service;

import com.example.demo.entity.TestBoard;
import com.example.demo.repository.TestBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TestBoardService {

    @Autowired
    private TestBoardRepository testBoardRepository;

    public List<TestBoard> findAll() {
        return testBoardRepository.findAll();
    }
}
