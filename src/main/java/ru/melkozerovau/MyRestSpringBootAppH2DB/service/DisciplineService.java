package ru.melkozerovau.MyRestSpringBootAppH2DB.service;

import org.springframework.stereotype.Service;
import ru.melkozerovau.MyRestSpringBootAppH2DB.entity.Discipline;

import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAllDisciplines();
    Discipline getDiscipline(int disid);
    Discipline saveDiscipline(Discipline discipline);
    void deleteDiscipline(int disid);
}
