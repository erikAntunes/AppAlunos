package com.example.alunosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.alunosapp.adapter.AlunoAdapter;
import com.example.alunosapp.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno aluno = new Aluno();
        aluno.setNome("Erik Antunes");
        aluno.setCurso("Android Developers");
        aluno.setCidade("São Paulo");
        listaAlunos.add(aluno);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Paulo Roberto");
        aluno1.setCurso("Android Developers");
        aluno1.setCidade("Rio de Janeiro");
        listaAlunos.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Michael Bale");
        aluno2.setCurso("Android Developers");
        aluno2.setCidade("Guarulhos");
        listaAlunos.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Eduardo Campos");
        aluno3.setCurso("Android Developers");
        aluno3.setCidade("Belo Horizonte");
        listaAlunos.add(aluno3);


        AlunoAdapter alunoAdapter = new AlunoAdapter(listaAlunos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.alunos_recycle_view);
        recyclerView.setAdapter(alunoAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
