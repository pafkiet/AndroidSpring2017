package com.pafkiet.androidspring17;

import java.util.ArrayList;

/**
 * Created by xorsat on 15/02/2017.
 */

public class ProductDatasource {

    public ArrayList<Product> getList() {

        ArrayList<Product> itemList = new ArrayList<>();

        ProductDatasource mProductDatasource = new ProductDatasource();

        itemList = mProductDatasource.getList();

        return itemList;
    }
}
