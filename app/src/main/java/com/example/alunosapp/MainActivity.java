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
        aluno.setNome("Erik");
        aluno.setCurso("Android");
        listaAlunos.add(aluno);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Paulo");
        aluno1.setCurso("Android");
        listaAlunos.add(aluno1);

        AlunoAdapter alunoAdapter = new AlunoAdapter(listaAlunos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.alunos_recycle_view);
        recyclerView.setAdapter(alunoAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
