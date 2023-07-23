package com.fredy.pokemonconsumer.classes.pokemon.characteristics;

import com.fredy.pokemonconsumer.classes.shared.Logger;

public class PokemonSprites extends Logger {
    public String front_default; //* The default depiction of this Pokémon from the front in battle.
    public String front_shiny; //* The shiny depiction of this Pokémon from the front in battle.
    public String front_female; //* The female depiction of this Pokémon from the front in battle.
    public String front_shiny_female; //* The shiny female depiction of this Pokémon from the front in battle.
    public String back_default; //* The default depiction of this Pokémon from the back in battle.
    public String back_shiny; //* The shiny depiction of this Pokémon from the back in battle.
    public String back_female; //* The female depiction of this Pokémon from the back in battle.
    public String back_shiny_female; //* The shiny female depiction of this Pokémon from the back in battle.

    public PokemonSprites() {
        super();
        logInfo("Created: PokemonSprites - No data");
    }

    public PokemonSprites(String front_default, String front_shiny, String front_female, String front_shiny_female, String back_default, String back_shiny, String back_female, String back_shiny_female) {
        super();
        this.front_default = front_default;
        this.front_shiny = front_shiny;
        this.front_female = front_female;
        this.front_shiny_female = front_shiny_female;
        this.back_default = back_default;
        this.back_shiny = back_shiny;
        this.back_female = back_female;
        this.back_shiny_female = back_shiny_female;
        logInfo("Created: PokemonSprites" + this.toString());
    }
}
