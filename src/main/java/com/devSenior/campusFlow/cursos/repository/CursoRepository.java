package com.devSenior.campusFlow.cursos.repository;


import com.devSenior.campusFlow.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
   
}