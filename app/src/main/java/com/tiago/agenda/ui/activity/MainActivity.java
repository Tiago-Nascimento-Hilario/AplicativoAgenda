package com.tiago.agenda.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import com.tiago.agenda.R;
import com.tiago.agenda.dao.AlunoDao;


public class MainActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setatando layout
        setContentView(R.layout.activity_main);

        setTitle("Lista de nomes");

        FloatingActionButton botaoAdicionarNovoNome = findViewById(R.id.activity_main_fab_novo_aluno);
        botaoAdicionarNovoNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FormularioAlunoActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        AlunoDao dao = new AlunoDao();
        ListView listaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                dao.todos()));

    }
}
