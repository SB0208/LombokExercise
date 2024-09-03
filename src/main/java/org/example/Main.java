package org.example;

import lombok.With;

public class Main {
    public static void main(String[] args)
    {
       LombokStudent student = new LombokStudent("Maria",10,"5","5a");
       Teacher teacher = new Teacher("Tom","Math","11");




       LombokStudent.LombokStudentBuilder lombokStudent = LombokStudent.builder()
               .name("Maria")
               .age(10)
               .id("5")
               .grade("5a");








       System.out.println(lombokStudent);
       System.out.println(teacher);

    }
}