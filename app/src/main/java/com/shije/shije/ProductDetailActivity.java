package com.shije.shije;


import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.shije.shije.models.CustomFields;
import com.shije.shije.models.Product;

import java.util.ArrayList;


public class ProductDetailActivity extends AppCompatActivity {

    private final static String EXTRA_PRODUCT = "product";

    private Product product;

    private Button orderButton;


    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        orderButton =(Button) findViewById(R.id.orderBtn);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(ProductDetailActivity.this).create();
                alertDialog.setTitle("Konfirmim");
                alertDialog.setMessage(product.getTitle().getRendered()+" eshte porositur me sukses");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        ImageView image;

        Bundle b = getIntent().getExtras();
        if (b != null) {

            product = b.getParcelable(EXTRA_PRODUCT);

            String productImage = getIntent().getStringExtra(product.getFimgUrl());
            ArrayList<CustomFields> customFields = new ArrayList<>();
//            customFields = getIntent().getStringArrayListExtra(product.getCustomFields());
            TextView name = findViewById(R.id.productNameDetail);
            name.setText(product.getTitle().getRendered());
            TextView cmimi = findViewById(R.id.productCmimiDetail);
            cmimi.setText("Cmimi");
            setImage(productImage);
        }



        //TODO
        //TODO REFRESH SWIPE TO REFRESH
//        toolbar.setTitle()



    }
    private void setImage(String productImage){

        ImageView image = findViewById(R.id.thumbnailProductDetail);
        Glide.with(this)
                .asBitmap()
                .load(product.getFimgUrl())
                .into(image);
    }
}
