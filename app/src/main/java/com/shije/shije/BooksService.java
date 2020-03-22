package com.shije.shije;

import com.shije.shije.models.Book;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BooksService {

    @GET("posts")
    Call<List<Book>> getBooks();

}
