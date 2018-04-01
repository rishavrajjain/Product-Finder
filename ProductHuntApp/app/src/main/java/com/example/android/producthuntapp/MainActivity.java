package com.example.android.producthuntapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_list);

        //Creating a list of products
        ArrayList<Products> products = new ArrayList<Products>();
        products.add(new Products("Shoot amazing chematic video on your phone", "Moment Filmmaker Collection", R.drawable.moment));
        products.add(new Products("Create beautiful coverart for your Spotify playlists", "Replace Cover", R.drawable.replace_logo));
        products.add(new Products("Take control of all your Facebook data", "Mozilla Facebook Container", R.drawable.mozilla));
        products.add(new Products("Instant post-purchase customer engagement", "Feedback", R.drawable.feedback));
        products.add(new Products("Emojify your text on Slack", "Emojify Bot", R.drawable.emojify));
        products.add(new Products("AI business name generator", "Namelix", R.drawable.na));
        products.add(new Products("Know your Friends birthday", "BirthDay", R.drawable.happy));


        // Created an ProductAdapter, whose data source is a list of products. The
        // adapter creates list items for each item in the list.

        ProductsAdapter adapter= new ProductsAdapter(this, products);
        ListView listView = (ListView) findViewById(R.id.list);

        // Displaying list items for each Product in the list.
        listView.setAdapter(adapter);
    }
}
