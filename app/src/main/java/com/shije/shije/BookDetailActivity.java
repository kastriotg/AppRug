package com.shije.shije;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.shije.shije.models.CustomFields;
import com.shije.shije.models.Book;

import java.util.ArrayList;


public class BookDetailActivity extends AppCompatActivity {

    private final static String EXTRA_PRODUCT = "product";

    private Book book;

    private Button orderButton;


    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        ImageView image;

        Bundle b = getIntent().getExtras();
        if (b != null) {

            book = b.getParcelable(EXTRA_PRODUCT);

//            String bookImage = getIntent().getStringExtra(book.getFimgUrl());
            ArrayList<CustomFields> customFields = new ArrayList<>();

            TextView name = findViewById(R.id.productNameDetail);
            name.setText(book.getTitle().getRendered());

            TextView description = findViewById(R.id.description);
            description.setText(book.getContent().getRendered());


            description.setText(book.getContent().getRendered());

            TextView autoret = findViewById(R.id.dituria);

            String content = "";
            content = "Dituria: " + book.getDetajetELibrit().getPrice().getDituria() + '\t'+'\t';
            content += "Bota: " + book.getDetajetELibrit().getPrice().getBota() + '\t'+'\t';
            content += "Dukagjini: " + book.getDetajetELibrit().getPrice().getDukagjini() + '\t'+'\t';
            content += "Koha: " + book.getDetajetELibrit().getPrice().getKoha() + '\t'+'\t';
            content += "Rilindja: " + book.getDetajetELibrit().getPrice().getRilindja() + '\t'+'\t';
            autoret.append(content);


        }



        //TODO
        //TODO REFRESH SWIPE TO REFRESH




    }

}
