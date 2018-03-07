package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kongxy on 2018/3/6 0006.
 */
public class BeerExpert {
    public List getBrands(String color) {
        List brands = new ArrayList();
        if (color.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Red moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
