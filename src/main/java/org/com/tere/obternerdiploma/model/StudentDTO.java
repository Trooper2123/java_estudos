package org.com.tere.obternerdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
public class StudentDTO {

    private static final int MAX_NAME_LENGTH = 50;
    private static final String NAME_STARTS_WITH_CAPITAL_REGEX = "^[A-Z]";


    @NotNull("O campo 'name' não pode estar vazio.")
    private String name;

    String message;
    Double averageScore;

    @NotNull("A lista não pode estar vazia.")
    List<SubjectDTO> subjectList;



 private boolean ValidateName (String name ) {
     return (name.length() <= MAX_NAME_LENGTH) && (name.matches(NAME_STARTS_WITH_CAPITAL_REGEX));
 }

}
