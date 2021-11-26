package com.company;

import kotlin.collections.UCollectionsKt;

import java.util.ArrayList;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        ArrayList <String>  family = new ArrayList <String>();
        family.add("Surabhi Singh");
        family.add("Arav singh");
        family.add("Sunil k singh");
        family.add("Neetu Singh");
        System.out.println("Arraylist  " + family);


       ArrayList <String> f2 = new ArrayList <String>();
       for (int h=family.size()-1;h>=0;h--){
           f2.add(family.get(h));
       }
        System.out.println(f2);

    }
}
