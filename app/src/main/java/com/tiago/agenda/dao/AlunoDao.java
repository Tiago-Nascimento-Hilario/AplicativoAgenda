package com.tiago.agenda.dao;

import com.tiago.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    private  final  static List<Aluno> alunos = new ArrayList<>(); // simulação de um banco de dados
    public void salva(Aluno aluno) {
        alunos.add(aluno);
    } //

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
