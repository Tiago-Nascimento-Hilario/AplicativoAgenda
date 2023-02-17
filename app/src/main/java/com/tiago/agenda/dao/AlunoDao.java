package com.tiago.agenda.dao;

import com.tiago.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    private final static List<Aluno> alunos = new ArrayList<>(); // simulação de um banco de dados
    private static int contadorIds = 1;

    public void salva(Aluno aluno) {
        aluno.setId(contadorIds);
        alunos.add(aluno);
        contadorIds++;
    }

    public void editar(Aluno aluno) {
        Aluno alunoEncontrado = null;
        for (Aluno a : alunos) {
            if (a.getId() == aluno.getId()) {
                alunoEncontrado = a;
            }
            if (alunoEncontrado != null) {
                int posicaoAlunoEncontrado = alunos.indexOf(alunoEncontrado);
                alunos.set(posicaoAlunoEncontrado, aluno);
            }
        }
    }




    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
