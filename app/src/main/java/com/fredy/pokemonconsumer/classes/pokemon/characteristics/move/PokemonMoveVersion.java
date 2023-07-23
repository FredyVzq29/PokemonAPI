package com.fredy.pokemonconsumer.classes.pokemon.characteristics.move;

import com.fredy.pokemonconsumer.classes.shared.Logger;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;

public class PokemonMoveVersion extends Logger {
    public NamedAPIResource move_learn_method; //* The method by which the move is learned.
    public NamedAPIResource version_group; //* The version group in which the move is learned.
    public int level_learned_at; //* The minimum level to learn the move.

    public PokemonMoveVersion() {
        super();
        logInfo("Created: PokemonMoveVersion - No data");
    }

    public PokemonMoveVersion(NamedAPIResource move_learn_method, NamedAPIResource version_group, int level_learned_at) {
        super();
        this.move_learn_method = move_learn_method;
        this.version_group = version_group;
        this.level_learned_at = level_learned_at;
        logInfo("Created: PokemonMoveVersion:" + this.toString());
    }
}
