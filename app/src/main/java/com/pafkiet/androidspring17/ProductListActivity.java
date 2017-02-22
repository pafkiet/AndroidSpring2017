package com.pafkiet.androidspring17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends Activity {

    ProductDatasource mProductDatasource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        mProductDatasource = new ProductDatasource();
        final ArrayList<Product> productArrayList = mProductDatasource.getList();
        ListView mListView = (ListView) findViewById(R.id.productList_listView);
        ProductAdapter mProductAdapter = new ProductAdapter(this, R.layout.row_product_list, productArrayList);
        mListView.setAdapter(mProductAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Product item = productArrayList.get(i);
                ProductDetailActivity.mProduct = item; // start activity detail
                Intent mIntent = new Intent(ProductListActivity.this,
                        ProductDetailActivity.class); startActivity(mIntent);

            }
        });

    }
}
