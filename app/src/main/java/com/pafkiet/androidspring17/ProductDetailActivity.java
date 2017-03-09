package com.pafkiet.androidspring17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProductDetailActivity extends Activity {

    public static Product mProduct;

    TextView tvProductTitle;
    TextView tvProductPrice;
    TextView tvProductDecs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        init();
        populate();
    }

    private void init() {
        tvProductTitle = (TextView) findViewById(R.id.actionBar_textView_title);
        tvProductPrice = (TextView) findViewById(R.id.productDetail_textView_productPrice);
        tvProductDecs = (TextView) findViewById(R.id.productDetail_textView_productDescription);
    }

    private void populate() {
        tvProductTitle.setText(mProduct.getProduct_name());
        tvProductPrice.setText(mProduct.getProduct_price());
        tvProductDecs.setText(mProduct.getProduct_description());
    }

    public void onClick_order(View v) {
        OrderActivity.item = mProduct;
        startActivity(new Intent(this, OrderActivity.class));
    }

    public void onClick_share(View v) {
        String strShareText = String.format(
                getResources().getString(R.string.message_product_share),
                mProduct.getProduct_name(), mProduct.getProduct_price());
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, strShareText);
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent,
                "Share " + mProduct.getProduct_name()));

    }
}