package com.example.teddykidanne.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putParcelable(DetailMovieActivityFragment.DETAIL_MOVIE,
                    getIntent().getParcelableExtra(DetailMovieActivityFragment.DETAIL_MOVIE));

            DetailMovieActivityFragment fragment = new DetailMovieActivityFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction().add(R.id.movie_detail_container,fragment).commit();

        }
    }
}
