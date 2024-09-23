package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoServiceTest {
@Test
 public void alunoServiceAlunoIdEncontradoTest() {
   AlunoService alunoService = new AlunoService();
   Aluno aluno = alunoService.getAlunoById(1);
    assertNotNull(aluno);
    assertEquals(1, aluno.getId());
    assertEquals("Kevin", aluno.getNome());
    assertEquals(9.0, aluno.getNota());
 }
@Test
 public void alunoServiceAlunoIdNaoEncontradoTest() {
     AlunoService alunoService = new AlunoService();
     Aluno aluno = alunoService.getAlunoById(99);
  assertNull(aluno);
 }
}