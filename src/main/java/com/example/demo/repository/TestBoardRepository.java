package com.example.demo.repository;

import com.example.demo.entity.TestBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Repository;

@Repository
public interface TestBoardRepository extends JpaRepository<TestBoard, Integer> {
}
