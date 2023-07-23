/***
 * * Doc link --> https://pokeapi.co/docs/v2#pokemon
 * * Section --> Pokemon > Pokemon
 */
package com.fredy.pokemonconsumer.classes.pokemon;

import com.fredy.pokemonconsumer.classes.game.VersionGameIndex;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.PokemonSprites;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.PokemonStat;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.held.PokemonHeldItem;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.move.PokemonMove;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.type.PokemonType;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.type.PokemonTypePast;
import com.fredy.pokemonconsumer.classes.shared.NamedAPIResource;
import com.fredy.pokemonconsumer.classes.pokemon.characteristics.PokemonAbility;
import com.fredy.pokemonconsumer.classes.shared.Logger;

public class Pokemon extends Logger {
    public int id;// * The identifier for this resource.
    public String name; // * The name for this resource.
    public int base_experience; // * The base experience gained for defeating this Pokémon.
    public int height; // * The height of this Pokémon in decimetres.
    public boolean is_default; // * Set for exactly one Pokémon used as the default for each species.
    public int order; // * Order for sorting. Almost national order, except families are grouped together.
    public int weight; // *The weight of this Pokémon in hectograms.
    public PokemonAbility[] abilities; //* A list of abilities this Pokémon could potentially have.
    public NamedAPIResource[] forms; //* A list of forms this Pokémon can take on.
    public VersionGameIndex[] gameIndices; //* A list of game indices relevent to Pokémon item by generation.
    public PokemonHeldItem[] held_items; //* A list of items this Pokémon may be holding when encountered.
    public String location_area_encounters; //* A link to a list of location areas, as well as encounter details pertaining to specific versions.
    public PokemonMove[] move; //* A list of moves along with learn methods and level details pertaining to specific version groups.
    public PokemonTypePast[] past_types; //* A list of details showing types this pokémon had in previous generations
    public PokemonSprites sprites; //* A set of sprites used to depict this Pokémon in the game.
    public NamedAPIResource[] species; //* The species this Pokémon belongs to.
    public PokemonStat[] stats; //* A list of base stat values for this Pokémon.
    public PokemonType[] types; //* A list of details showing types this Pokémon has.

    public Pokemon(int id) {
        super();
        this.id = id;
        logInfo("Pokemon Created:" + this.toString());
    }

    public Pokemon(int id, String name, int base_experience, int height, boolean is_default, int order, int weight, PokemonAbility[] abilities, NamedAPIResource[] forms, VersionGameIndex[] gameIndices, PokemonHeldItem[] held_items, String location_area_encounters, PokemonMove[] move, PokemonTypePast[] past_types, PokemonSprites sprites, NamedAPIResource[] species, PokemonStat[] stats, PokemonType[] types) {
        super();
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.height = height;
        this.is_default = is_default;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.held_items = held_items;
        this.location_area_encounters = location_area_encounters;
        this.move = move;
        this.past_types = past_types;
        this.sprites = sprites;
        this.species = species;
        this.stats = stats;
        this.types = types;
        logInfo("Pokemon Created:" + this.toString());
    }
}
