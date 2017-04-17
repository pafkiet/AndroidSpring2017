package com.pafkiet.androidspring17;

import android.provider.BaseColumns;

/**
 * Created by princ on 4/12/2017.
 */

public class ProductContract {

    public ProductContract() {


    }

    /* Inner class that defines the table contents */
    public static abstract class ProductEntry implements BaseColumns {


        public static final String TABLE_NAME = "tbl_product";
        public static final String COLUMN_NAME_PRODUCT_ID = "product_id";
        public static final String COLUMN_NAME_PRODUCT_NAME = "product_name";
        public static final String COLUMN_NAME_PRODUCT_PRICE = "product_price";
// other columns variables - -

    }

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + ProductEntry.TABLE_NAME;
    public static final String SQL_SELECT_ALL = "SELECT * FROM " + ProductEntry.TABLE_NAME;
    public static final String SQL_DELETE_ALL = "DELETE FROM " + ProductEntry.TABLE_NAME;

    public static final String SQL_CREATE =
            "CREATE TABLE " + ProductEntry.TABLE_NAME + " (" + ProductEntry._ID
                    + " INTEGER PRIMARY KEY," + ProductEntry.COLUMN_NAME_PRODUCT_ID
                    + TEXT_TYPE + COMMA_SEP + ProductEntry.COLUMN_NAME_PRODUCT_NAME
                    + TEXT_TYPE + COMMA_SEP + ProductEntry.COLUMN_NAME_PRODUCT_PRICE
// other columns ..
                    + " )";


}
