package io.pragra;

import io.pragra.domain.Course;
import io.pragra.domain.Student;
import io.pragra.service.StudentService;
import lombok.val;

import java.time.Instant;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        var service = new StudentService();

        val student = Student.builder().studentId(2).name("Atin").build();


        service.createStudent(student);
        service.createStudent(Student.builder().studentId(3).build());

       var course = Course.builder().name("Java").createDate(Instant.now()).build();

        System.out.println(service);
    }
}
