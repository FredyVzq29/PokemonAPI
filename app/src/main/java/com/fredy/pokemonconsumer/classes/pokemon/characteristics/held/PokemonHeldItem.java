package com.fredy.pokemonconsumer.classes.pokemon.characteristics.held;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonHeldItem extends Logger {
    public NamedAPIResource item; //* The item the referenced Pokémon holds.
    public PokemonHeldItemVersion version_details; //* The item the referenced Pokémon holds.

    public PokemonHeldItem() {
        super();
        logInfo("Created: PokemonHeldItem - No data");
    }

    public PokemonHeldItem(NamedAPIResource item, PokemonHeldItemVersion version_details) {
        super();
        this.item = item;
        this.version_details = version_details;
        logInfo("Created: PokemonHeldItem - " + this.toString());
    }
}
