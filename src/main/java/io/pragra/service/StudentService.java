package io.pragra.service;

import io.pragra.domain.Student;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ToString
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public boolean createStudent(Student student) {
        return students.add(student);
    }
    public Optional<Student> findStudentByID(int studentId){
        return students.stream().filter(s->s.getStudentId()==studentId).findAny();
    }
    public void deleteStudent(int studentId){
        var student = students.stream().filter(s->s.getStudentId()==studentId).findAny();
        student.ifPresent(students::remove);
    }
}
