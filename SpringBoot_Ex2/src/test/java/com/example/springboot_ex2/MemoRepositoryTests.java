package com.example.springboot_ex2;

import com.example.springboot_ex2.entity.Memo;
import com.example.springboot_ex2.repositoy.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {

    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }
    public void testInsertDummies(){

        IntStream.rangeClosed(1,100).forEach(i ->{
           Memo memo = Memo.builder().memoText("Sample..."+i).build();
           memoRepository.save(memo);
        });
    }

    @Test
    @Transactional
    public void testSelectAll(){
        Long memo_num  = 100l;

        Optional<Memo> result = memoRepository.findById(memo_num);

        System.out.println("===========================================");

        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println(memo);
        }
    }

    @Test
    public void testUpdate(){
        Memo memo = Memo.builder().memo_num(100L).memoText("Update Text").build();

        System.out.println(memoRepository.save(memo));
    }

    @Test
    public void testDelete(){
        Long memo_num = 100l;

        memoRepository.deleteById(100L);
    }

    @Test
    public void testPageDefault(){
        PageRequest pageable = PageRequest.of(0,10);

        Page<Memo> result = memoRepository.findAll(pageable);

        System.out.println(result);
        System.out.println("==========================================");
        System.out.println("Total Pages"+result.getTotalPages());
        System.out.println("Total Count: "+result.getTotalElements());
        System.out.println("Page Number"+result.getNumber());
        System.out.println("Page Size: "+result.getSize());
        System.out.println("Has next Page? : " + result.hasNext());
        System.out.println("First page? : "+result.isFirst());

        for( Memo memo : result.getContent()) {
            System.out.println(memo);
        }
    }

    @Test
    public void testSort(){

        Sort sort1 = Sort.by("memo_num").descending();
        Pageable pageable = PageRequest.of(0,10,sort1);
        Page<Memo> result = memoRepository.findAll(pageable);

        result.get().forEach(memo ->{
            System.out.println(memo);
        });
    }

    @Test
    public void testQueryMethod(){

        List<Memo> list = memoRepository.findbyMemoNumBetweenOrderByDes(70L, 80L);

        for(Memo memo:list){
            System.out.println(memo);
        }
    }



}
