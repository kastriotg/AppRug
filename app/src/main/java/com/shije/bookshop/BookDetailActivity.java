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
        initCollapsingToolbar();
        ImageView image;

        Bundle b = getIntent().getExtras();
        if (b != null) {

            book = b.getParcelable(EXTRA_PRODUCT);
            ImageView single_book = findViewById(R.id.app_bar_image);
            Glide.with(this).load(book.getImages().get(0).getSrc()).into(single_book);

            TextView name = findViewById(R.id.single_book_name);
            name.setText(book.getName());

        }




    }
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(book.getName());
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(book.getName());
                    isShow = false;
                }
            }
        });
    }

}
