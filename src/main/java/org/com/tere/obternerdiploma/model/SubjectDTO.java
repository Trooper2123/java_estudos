package org.com.tere.obternerdiploma.model;

import javax.management.MXBean;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
public class SubjectDTO {

    private static final int MAX_NAME_LENGTH = 30;
    private static final String NAME_STARTS_WITH_CAPITAL_REGEX = "^[A-Z]"


    @NotNull("O campo não pode estar vazio.")
    String name;

    @NotNull("A nota não pode ser vazia.")
    Double score;

    private boolean ValidateName (String name) {
        return (name.length() <= MAX_NAME_LENGTH) && (name.matches(NAME_STARTS_WITH_CAPITAL_REGEX));
    }

    private boolean ValidateScore (double score) {
        return (score >= 0.0) && (score <= 10.0);
    }
}

