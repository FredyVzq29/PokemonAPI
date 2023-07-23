package com.fredy.pokemonconsumer.classes.pokemon.characteristics;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonAbility extends Logger {
    public boolean is_hidden; //* Whether or not this is a hidden ability.
    public int slot; //* The slot this ability occupies in this Pokémon species.
    public NamedAPIResource ability; //* The ability the Pokémon may have.

    public PokemonAbility() {
        super();
        logInfo("Created: PokemonAbility - No data");
    }

    public PokemonAbility(boolean is_hidden, int slot, NamedAPIResource ability) {
        super();
        this.is_hidden = is_hidden;
        this.slot = slot;
        this.ability = ability;
        logInfo("Created: PokemonAbility" + this.toString());
    }
}
