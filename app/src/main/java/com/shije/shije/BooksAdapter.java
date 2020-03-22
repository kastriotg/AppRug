package com.shije.shije;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.shije.shije.models.Book;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ProductViewHolder>{

    private Context context;
    private List<Book> productList;

    // CONSTRUCTOR
    public BooksAdapter(Context context, List<Book> productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_layout,viewGroup,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder viewHolder, final int position) {
        Book product = productList.get(position);
        viewHolder.productTitle.setText(product.getTitle().getRendered());
        Glide.with(context).load(product.getFimgUrl()).into(viewHolder.productImage);

//        viewHolder.productImage.setText(product.getImage());
//       viewHolder.productPrice.setText(product.getCustomFields().getCmimi().get(0));
//        viewHolder.productInventory.setText(product.getInventory());
//        viewHolder.productDescription.setText(product.getContent().toString());

        viewHolder.cardView.setOnClickListener(v -> {
            Intent mIntent = new Intent(context, BookDetailActivity.class);
            Bundle extras = new Bundle();
            extras.putParcelable("product", product);
            mIntent.putExtras(extras);
            context.startActivity(mIntent);
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        CardView cardView ;
        ImageView productImage;
        TextView productTitle, productPrice, productInventory, productDescription;
        LinearLayout parentLayout;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productTitle = itemView.findViewById(R.id.productLayoutName);
            productImage = itemView.findViewById(R.id.bookThumbnail);
//            productPrice =itemView.findViewById(R.id.productLayoutCmimi);
//            productInventory = itemView.findViewById(R.id.productLayoutInventory);
//            productDescription = itemView.findViewById(R.id.productLayoutDescription);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }


}
