package com.example.springboot_ex2.repositoy;

import com.example.springboot_ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findbyMemoNumBetweenOrderByDes(Long from, Long to);
}
