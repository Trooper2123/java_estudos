package org.com.tere.obternerdiploma.service;


import java.text.DecimalFormat;
import java.util.List;
import org.com.tere.obternerdiploma.model.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class ObtenerDiplomaService implements IObtenerDiplomaService {

    @Override
    public StudentDTO analyzeScores(StudentDTO rq) {
        rq.setAverageScore(calculateAverage(rq.getSubjects()));
        rq.setMessage(getGreetingMessage(rq.getStudentName(), rq.getAverageScore()));

        return rq;
    }

    private String getGreetingMessage(String studentName, Double average) {
        return "El alumno " + studentName + " ha obtenido un promedio de " + new DecimalFormat("#.##").format(average)
                + ((average > 9) ? ". Felicitaciones!" : ". Puedes mejorar.");
    }

    private Double calculateAverage(List<SubjectDTO> scores) {
        return scores.stream()
                .reduce(0D, (partialSum, score)  -> partialSum + score.getScore(), Double::sum)
                / scores.size();
    }
}
