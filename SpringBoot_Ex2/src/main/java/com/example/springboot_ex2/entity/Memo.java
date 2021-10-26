package com.example.springboot_ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "MEMO_TB")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memo_num;

    @Column(length = 200, nullable = false)
    private String memoText;

    

}
