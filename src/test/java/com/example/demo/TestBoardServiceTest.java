package com.example.demo;

import com.example.demo.entity.TestBoard;
import com.example.demo.service.TestBoardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.repository.TestBoardRepository;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class TestBoardServiceTest {

    @Autowired
    private TestBoardService testBoardService;

    @Autowired
    private TestBoardRepository testBoardRepository;

    @BeforeEach
    public void setUp() {
        // 테스트 데이터 삽입
        TestBoard testBoard = new TestBoard();
        testBoard.setTitle("Sample Title");
        testBoard.setContent("Sample Content");
        testBoard.setRegDateTime(LocalDateTime.now());
        testBoardRepository.save(testBoard);
    }

    @Test
    public void testFindAll() {
        List<TestBoard> testBoards = testBoardService.findAll();
        assertThat(testBoards).isNotEmpty();
    }
}
