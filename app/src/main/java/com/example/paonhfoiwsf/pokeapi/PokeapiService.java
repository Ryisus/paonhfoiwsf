package com.example.paonhfoiwsf.pokeapi;

import com.example.paonhfoiwsf.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();

}
