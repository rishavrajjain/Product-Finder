package com.example.android.producthuntapp;

/**
 * Created by User on 3/30/2018.
 */

public class Products{

    /** Name of the Products */
    private String pName;

    /** Description of the product */
    private String pSummary;

    /** Image resource ID for the word */
    private int pImageResourceId = NO_IMAGE_PROVIDED;

    /** It represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Creating a new Product object.
     *
     * @param prouctName is the name of the product
     * @param prouctDescription is the description of the product
     * @param imageResourceId is the drawable resource ID for the image associated with the product
     *
     */
    public Products(String prouctName, String prouctDescription, int imageResourceId) {
        pName = prouctName;
        pSummary = prouctDescription;
        pImageResourceId = imageResourceId;
    }

    /**
     * Getting the name of the Products.
     */
    public String getName() {
        return pName;
    }

    /**
     * Get the Description of the product.
     */
    public String getDescription() {
        return pSummary;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return pImageResourceId;
    }

    /**
     * It returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return pImageResourceId != NO_IMAGE_PROVIDED;
    }
}