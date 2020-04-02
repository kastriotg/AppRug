package com.shije.bookshop;


import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.shije.bookshop.models.Book;
import com.shije.bookshop.models.Image;

import java.util.ArrayList;


public class BookDetailActivity extends AppCompatActivity {

    private final static String EXTRA_PRODUCT = "product";

    private Book book;




    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
//        initCollapsingToolbar();
        ImageView image;

        Bundle b = getIntent().getExtras();
        if (b != null) {

            book = b.getParcelable(EXTRA_PRODUCT);
            ImageView single_book = findViewById(R.id.bookphoto);
            Glide.with(this).load(book.getImages().get(0).getSrc()).into(single_book);

            TextView name = findViewById(R.id.single_book_name);
            name.setText(book.getName());

            TextView price = findViewById(R.id.cmimi);
            price.setText(book.getPrice());

            TextView shortDescription = findViewById(R.id.app_pershkrimi);
            shortDescription.setText(book.getShortDescription());

        }




    }


}
