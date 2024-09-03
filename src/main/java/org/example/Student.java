package org.example;

public class Student {

    private String name;
    private int age;
    private String id;
    private String grade;
    public Student(String name, int age, String id, String grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
       ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;


    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student the = (Student) obj;
        return age == the.getAge() && id.equals(the.getId()) && grade == the.getGrade() && name.equals(the.getName());



    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                '}';
    }
}
