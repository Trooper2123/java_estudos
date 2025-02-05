package org.com.tere.obternerdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.List;

@Getter
@Setter
public class StudentDTO {

    private static final int MAX_NAME_LENGTH = 50;
    private static final String NAME_STARTS_WITH_CAPITAL_REGEX = "^[A-Z]";


    @NotNull("O campo 'name' não pode estar vazio.")
    @Pattern(value = NAME_STARTS_WITH_CAPITAL_REGEX)
    private String name;

    String message;
    Double averageScore;

    @NotNull("A lista não pode estar vazia.")
    List<SubjectDTO> subjectList;



 private boolean ValidateName (String name,int minSize ) {
     return (name.length() <= minSize) && (name.matches(NAME_STARTS_WITH_CAPITAL_REGEX));
 }

}
