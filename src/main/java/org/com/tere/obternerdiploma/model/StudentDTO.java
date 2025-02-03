package org.com.tere.obternerdiploma.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StudentDTO {

    @NotNull(message = "campo não pode estar vazio.")
    @Max(value = 50, message = "comprimento do nome não pode exceder 50 caracteres.")
    @Pattern(regexp = "^[A-Z]", message = "O campo deve começar com uma letra maiúscula.")
    String studentName;
    String message;
    Double averageScore;

    @NotEmpty    (message = "A lista não pode estar vazia.")
    List<SubjectDTO> subjects;
}
