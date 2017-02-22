package com.pafkiet.androidspring17;

import java.util.ArrayList;

/**
 * Created by xorsat on 15/02/2017.
 */

public class ProductDatasource {

    public ArrayList<Product> getList() {
        ArrayList<Product> itemList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Product item = new Product();
            item.setProduct_id(i);
            item.setProduct_name("Product " + i);
            item.setProduct_price("" + (i + 10) + " PKR");
            item.setProduct_description("desc of " + i);
            item.setProduct_image("" + i);
            itemList.add(item);
        }
        return itemList;
    }
}
