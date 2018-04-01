package com.example.android.producthuntapp;

/**
 * Created by User on 3/30/2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *  ProductsAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is a list of Products objects.
 */
public class ProductsAdapter extends ArrayAdapter<Products>  {

    /**
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of Products to be displayed.
     */
    public ProductsAdapter(Context context, ArrayList<Products> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checking if an existing view is being reused, otherwise inflating the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Getting the Products object located at this position in the list
        Products currentProduct = getItem(position);

        // Finding the TextView in the list_item.xml layout with the ID product_text_view.
        TextView productTextView = (TextView) listItemView.findViewById(R.id.product_text_view);
        // Getting the Products Name from the currentProduct object and set this text on
        // the Products TextView.
        productTextView.setText(currentProduct.getDescription());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        // Getting the description from the currentProduct object and setting this text on
        // the Description TextView.
        descriptionTextView.setText(currentProduct.getName());

        // Finding the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Checking if an image is provided for this word or not
        if (currentProduct.hasImage()) {
            // Image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentProduct.getImageResourceId());
            // Making sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Else hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Returning the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}