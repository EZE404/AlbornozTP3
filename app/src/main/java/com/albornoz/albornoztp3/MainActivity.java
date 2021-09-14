package com.albornoz.albornoztp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLista;
    private MovieAdapter movieAdapter;
    private MovieViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewLista = findViewById(R.id.RVLista);
        mViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MovieViewModel.class);

        // Crea hilo paralelo
        mViewModel.getMoviesMutable().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                        MainActivity.this,
                        LinearLayoutManager.VERTICAL,
                        false
                );
                recyclerViewLista.setLayoutManager(linearLayoutManager);
                movieAdapter = new MovieAdapter(MainActivity.this, movies);
                recyclerViewLista.setAdapter(movieAdapter);
            }
        });


    }
}