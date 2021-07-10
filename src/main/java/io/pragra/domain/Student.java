package io.pragra.domain;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class Student {
    private int age;
    private String name;
    private int studentId;
    private List<Course> courses;
    private Instant createDate;
}
