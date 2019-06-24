package com.example.alunosapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alunosapp.R;
import com.example.alunosapp.model.Aluno;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {

    private List<Aluno> listaAlunos;

    public AlunoAdapter(List<Aluno> listaAlunos) { this.listaAlunos =listaAlunos; }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aluno_celula,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Aluno aluno = listaAlunos.get(i);
        viewHolder.setupAluno(aluno);
    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView perfilImageView;
        private TextView nomeTextView;
        private TextView cursoTextView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            perfilImageView = itemView.findViewById(R.id.perfil_image_view);
            nomeTextView = itemView.findViewById(R.id.nome_aluno_text_view);
            cursoTextView = itemView.findViewById(R.id.curso_aluno_text_view);

        }

        public void setupAluno(Aluno aluno) {

            nomeTextView.setText(aluno.getNome());
            cursoTextView.setText(aluno.getCurso());


        }
    }
}
