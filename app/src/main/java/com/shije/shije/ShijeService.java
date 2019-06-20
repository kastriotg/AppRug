package com.shije.shije;

import com.google.gson.JsonArray;
import com.shije.shije.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShijeService {

    @GET("posts")
    Call<List<Product>> getProducts();

}
