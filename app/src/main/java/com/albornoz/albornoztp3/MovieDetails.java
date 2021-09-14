package com.albornoz.albornoztp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetails extends AppCompatActivity {

    private ImageView ivCover;
    private TextView tvTitle, tvSummary, tvCast, tvDirector;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        movie = (Movie) getIntent().getExtras().getBundle("bundle").getSerializable("movie");
        initializeViews();
        loadMovieDetails();
    }

    private void initializeViews() {
        ivCover = findViewById(R.id.ivCoverDetails);
        tvTitle = findViewById(R.id.tvTitleDetails);
        tvSummary = findViewById(R.id.tvSummaryDetails);
        tvCast = findViewById(R.id.tvCast);
        tvDirector = findViewById(R.id.tvDirector);
    }

    private void loadMovieDetails() {
        if (movie != null) {
            ivCover.setImageResource(movie.getIdCover());
            tvTitle.setText(movie.getTitle());
            tvSummary.setText(movie.getBody());
            tvCast.setText(movie.getCast());
            tvDirector.setText(movie.getDirector());
        } else {
            /* TODO: HACER OTRA ACTIVITY O LLENAR LOS VIEWS CON DATOS GENÉRICOS
             *   O HACER UN MUTABLE DATA CON ALGÚN BOOLEANO */
            Log.d("movie", "loadMovieDetails: No se encontró película");
        }
    }
}