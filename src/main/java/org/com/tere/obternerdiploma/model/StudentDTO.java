package org.com.tere.obternerdiploma.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentDTO {
    String studentName;
    String message;
    Double averageScore;
    List<SubjectDTO> subjects;
}
