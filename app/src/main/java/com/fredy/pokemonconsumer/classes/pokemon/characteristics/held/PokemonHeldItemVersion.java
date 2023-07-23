package com.fredy.pokemonconsumer.classes.pokemon.characteristics.held;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonHeldItemVersion extends Logger {
    public NamedAPIResource version; //* The version in which the item is held.
    public int rarity; //* How often the item is held.

    public PokemonHeldItemVersion() {
        super();
        logInfo("Created: PokemonHeldItemVersion - No data");
    }

    public PokemonHeldItemVersion(NamedAPIResource version, int rarity) {
        super();
        this.version = version;
        this.rarity = rarity;
        logInfo("Created: PokemonHeldItemVersion" + this.toString());
    }
}
