package com.temmytechie.filter;


import java.util.ArrayList;
import java.util.List;

class Product
{

    int id;
    String name;
    double price;

    public Product(int id, String name,double price )
    {
        this.id = id;
        this.name = name;
        this.price= price;

    }

}
public class FilterDemo4 {


    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(1,"hp laptop", 23450.90));
        productList.add(new Product(2,"dell laptop", 2100.60));
        productList.add(new Product(3,"mac laptop", 2800.70));
        productList.add(new Product(4,"hp laptop", 23120.10));
        productList.add(new Product(5,"nevona laptop", 22150.90));

        productList.stream()
                .filter(product -> product.price > 22000)
                .forEach(product -> System.out.println(product.name + " " + product.price));







    }

}
