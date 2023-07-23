package com.fredy.pokemonconsumer.classes.pokemon.characteristics;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonStat extends Logger {
    public NamedAPIResource stat; //* The stat the Pokémon has.
    public int effort; //* The effort points (EV) the Pokémon has in the stat.
    public int base_stat; //* The base value of the stat.

    public PokemonStat() {
        super();
        logInfo("Created: PokemonStat - No data");
    }

    public PokemonStat(NamedAPIResource stat, int effort, int base_stat) {
        super();
        this.stat = stat;
        this.effort = effort;
        this.base_stat = base_stat;
        logInfo("Created: PokemonStat" + this.toString());
    }
}
