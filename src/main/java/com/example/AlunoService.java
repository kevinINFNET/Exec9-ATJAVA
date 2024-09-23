package com.example;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
 private final List<Aluno> alunos;
  public AlunoService() {
     alunos = new ArrayList<>();
     alunos.add(new Aluno(1, "Kevin", 9.0));
     alunos.add(new Aluno(2, "Wesley", 6.5));
     alunos.add(new Aluno(3, "Julia", 5.5));
     alunos.add(new Aluno(4, "Rafael", 7.5));
    }
public List<Aluno> getAllAlunos() {
        return alunos;
    }
  public Aluno getAlunoById(int id) {
    return alunos.stream()
     .filter(aluno -> aluno.getId() == id)
     .findFirst()
     .orElse(null);
  }
public void updateAluno(int id, String nome, double nota) {
  Aluno aluno = getAlunoById(id);
   if (aluno != null) {
     aluno.setNome(nome);
     aluno.setNota(nota);
   }
 }

public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

public void deleteAluno(int id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }
}