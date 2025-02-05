package org.com.tere.obternerdiploma.controller;


import org.com.tere.obternerdiploma.model.StudentDTO;
import org.com.tere.obternerdiploma.service.IObtenerDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObtenerDiplomaController {

    @Autowired
    IObtenerDiplomaService service;

    @PostMapping("/analyzeScores")
    public StudentDTO analyzeScores(@RequestBody StudentDTO rq) {
        return service.analyzeScores(rq);
    }
}
