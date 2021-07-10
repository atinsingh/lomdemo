package io.pragra.domain;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class Course {
    private String name;
    private Instant createDate;
}
