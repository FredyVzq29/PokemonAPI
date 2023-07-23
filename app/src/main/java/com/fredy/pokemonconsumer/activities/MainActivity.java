package com.fredy.pokemonconsumer.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fredy.pokemonconsumer.R;

public class MainActivity extends AppCompatActivity {
    private Button randomPokemon = (Button) findViewById(R.id.random_button); //* Property used to handle clicks of random pokemon button
    private Button searchPokemon = (Button) findViewById(R.id.search_button); //* Property used to handle clicks of search pokemon button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupAllProperties();
    }

    /**
     * This method is used to load and set the properties of the class
     */
    private void setupAllProperties() {
        randomPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandomPokemonCall();
            }
        });

        searchPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSearchPokemonView();
            }
        });
    }

    /**
     * Requesting a random pokemon
     */
    private void generateRandomPokemonCall() {

    }

    /**
     * Method used to change page to a search pokemon
     */
    private void goToSearchPokemonView() {

    }
}