package com.feeham.playground.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Document(collection = "students")
public class Student {
    private Long id;
    private String name;
    private String roll;
    private String department;
}
