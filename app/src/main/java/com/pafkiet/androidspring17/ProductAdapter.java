package com.pafkiet.androidspring17;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xorsat on 22/02/2017.
 */

public class ProductAdapter extends ArrayAdapter<Product> {
    Context context;

    public ProductAdapter(Context _context, int resource, List<Product> objects) {
        super(_context, resource, objects);
        this.context = _context;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Product item = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_product_list, parent, false);

        TextView mTextViewProductName = (TextView) rowView.findViewById(R.id.row_product_name);
        TextView mTextViewProductPrice = (TextView) rowView.findViewById(R.id.row_product_price);

        mTextViewProductName.setText(item.getProduct_name());
        mTextViewProductPrice.setText(item.getProduct_price());


        return rowView;
        //return super.getView(position, convertView, parent);
    }
}
