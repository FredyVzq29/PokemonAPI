/***
 * * Doc link --> https://pokeapi.co/docs/v2#pokemon
 * * Section --> Pokemon > Pokemon
 */
package com.fredy.pokemonconsumer.classes.pokemon;

import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.PokemonAbility;
import com.fredy.pokemonconsumer.classes.shared.Logger;

public class Pokemon extends Logger {
    private int id;// * The identifier for this resource.
    private String name; // * The name for this resource.
    private int base_experience; // * The base experience gained for defeating this Pokémon.
    private int height; // * The height of this Pokémon in decimetres.
    private boolean is_default; // * Set for exactly one Pokémon used as the default for each species.
    private int order; // * Order for sorting. Almost national order, except families are grouped together.
    private int weight; // *The weight of this Pokémon in hectograms.
    private PokemonAbility[] abilities; //* A list of abilities this Pokémon could potentially have.
    private NamedAPIResource[] forms; //* A list of forms this Pokémon can take on.

    private String location_area_encounters; //* A link to a list of location areas, as well as encounter details pertaining to specific versions.
    private NamedAPIResource[] species; //* The species this Pokémon belongs to.
    public Pokemon(int id) {
        super();
        this.id = id;
        logInfo("Pokemon Created:" + this.toString());
    }
}
