package com.shije.bookshop;

import com.shije.bookshop.models.Book;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;


public interface BooksService {

    @GET("products")
    Call<List<Book>> getBooks();

}
