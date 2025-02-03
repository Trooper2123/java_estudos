package org.com.tere.obternerdiploma.model;

import javax.management.MXBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectDTO {

    @Size(min = 10, max = 30, message = "Comprimento máximo de 30 caracteres.")
    @NotNull(message = "O campo não pode estar vazio.")
    @Pattern(regexp = "^[A-Z]", message = "O campo deve começar com uma letra maiúscula.")
    String name;

    
    @Size(min = 0.0, max = 10.0, message = "Nota deve estar entre 0.0 e 10.0")
    @NotNull(message = "A nota não pode ser vazia.")
    Double score;
}

