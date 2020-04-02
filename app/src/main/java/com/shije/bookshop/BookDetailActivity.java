package com.shije.bookshop;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.shije.bookshop.models.Book;

import java.util.ArrayList;


public class BookDetailActivity extends AppCompatActivity {

    private final static String EXTRA_PRODUCT = "product";

    private Book book;




    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ImageView image;

        Bundle b = getIntent().getExtras();
        if (b != null) {

            book = b.getParcelable(EXTRA_PRODUCT);

//            String bookImage = getIntent().getStringExtra(book.getFimgUrl());

            TextView name = findViewById(R.id.productNameDetail);
//            name.setText();

        }




    }

}
