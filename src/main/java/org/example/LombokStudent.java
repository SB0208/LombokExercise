package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@Builder

public class LombokStudent {

    private String name;
    private int age;
    private String id;
    private String grade;
}
