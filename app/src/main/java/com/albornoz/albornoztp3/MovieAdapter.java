package com.albornoz.albornoztp3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MiViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private List<Movie> movies;

    public MovieAdapter(
            Context context,
            List<Movie> movies
    ) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override // Referenciar a la vista item_movie y pasarla a la clase MiViewHolder
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_movie, parent, false);
        return new MiViewHolder(view);
    }

    @Override // Se ejecuta por cada movie de la lista
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        Movie m = movies.get(position);
        holder.tvTitle.setText(m.getTitle());
        holder.tvSummary.setText(m.getBody());
        holder.ivFoto.setImageResource(m.getIdCover());
        holder.cvMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MovieDetails.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("movie", m);
                intent.putExtra("bundle", bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override // Retorna la cardinalidad de la lista de movies
    public int getItemCount() {
        return movies.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {

        private CardView cvMovie;
        private TextView tvSummary, tvTitle;
        private ImageView ivFoto;


        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            cvMovie = itemView.findViewById(R.id.cvMovie);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvSummary = itemView.findViewById(R.id.tvSummary);
        }
    }
}
