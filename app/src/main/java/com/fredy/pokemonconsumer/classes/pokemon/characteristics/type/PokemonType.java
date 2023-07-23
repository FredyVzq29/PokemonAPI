package com.fredy.pokemonconsumer.classes.pokemon.characteristics.type;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonType extends Logger {
    public int slot; //* The order the Pokémon's types are listed in.
    public NamedAPIResource type; //* The type the referenced Pokémon has.

    public PokemonType() {
        super();
        logInfo("Created: PokemonType - No data");
    }

    public PokemonType(int slot, NamedAPIResource type) {
        super();
        this.slot = slot;
        this.type = type;
        logInfo("Created: PokemonType:" + this.toString());
    }
}
