package com.fredy.pokemonconsumer.classes.pokemon.characteristics.type;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonTypePast extends Logger {
    public NamedAPIResource generation; //* The last generation in which the referenced pokémon had the listed types.
    public PokemonType[] types; //* The types the referenced pokémon had up to and including the listed generation.

    public PokemonTypePast() {
        super();
        logInfo("Created: PokemonTypePast - No data");
    }

    public PokemonTypePast(NamedAPIResource generation, PokemonType[] types) {
        super();
        this.generation = generation;
        this.types = types;
        logInfo("Created: PokemonTypePast:" + this.toString());
    }
}
