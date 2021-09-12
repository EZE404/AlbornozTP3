package com.albornoz.albornoztp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLista;
    private MovieAdapter movieAdapter;
    private MovieViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = new MovieViewModel();
        recyclerViewLista = findViewById(R.id.RVLista);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        recyclerViewLista.setLayoutManager(linearLayoutManager);
        movieAdapter = new MovieAdapter(this, mViewModel.getMovies());
        recyclerViewLista.setAdapter(movieAdapter);
    }
}