package creation.builder;

import creation.builder.m1.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        useMethod1();
    }

    static void useMethod1() {
        Student student = Student
                .builder()
                .id(12)
                .age(26)
                .grade(2)
                .name("Lucas")
                .college("广州南洋理工职业学院")
                .profession("MySelf")
                .awards(new ArrayList<>())
                .build();

        System.out.println(student);
    }
}
