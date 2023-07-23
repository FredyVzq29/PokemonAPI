package com.fredy.pokemonconsumer.classes.pokemon.characteristics.move;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonMove extends Logger {
    public NamedAPIResource move; //* The move the Pokémon can learn.
    public PokemonMoveVersion version_group_details; //* The details of the version in which the Pokémon can learn the move.

    public PokemonMove() {
        super();
        logInfo("Created: PokemonMove - No data");
    }

    public PokemonMove(NamedAPIResource move, PokemonMoveVersion version_group_details) {
        super();
        this.move = move;
        this.version_group_details = version_group_details;
        logInfo("Created: PokemonMove:" + this.toString());
    }
}
