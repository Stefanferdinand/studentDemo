package com.example.studentDemo.Student;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table( name = "STUDENT")
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}