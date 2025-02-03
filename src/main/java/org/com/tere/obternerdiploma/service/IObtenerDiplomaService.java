package org.com.tere.obternerdiploma.service;


import org.com.tere.obternerdiploma.model.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public interface IObtenerDiplomaService {

    StudentDTO analyzeScores(StudentDTO rq);
}
