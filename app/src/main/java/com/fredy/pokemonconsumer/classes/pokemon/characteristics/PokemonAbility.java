package com.fredy.pokemonconsumer.classes.pokemon.characteristics;

import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonAbility {
    public boolean is_hidden;
    public int slot;
    public NamedAPIResource ability;

    public PokemonAbility() {
    }

    public PokemonAbility(boolean is_hidden, int slot, NamedAPIResource ability) {
        this.is_hidden = is_hidden;
        this.slot = slot;
        this.ability = ability;
    }
}
