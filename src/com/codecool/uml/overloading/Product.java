package com.codecool.uml.overloading;
import java.util.Currency;
import java.util.List;
import java.util.ArrayList;

public class Product {

    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;  // TODO What the hell is Currency?
    private ProductCategory productCategory = new ProductCategory();
    private Supplier supplier = new Supplier();
    private static List<String> productList = new ArrayList<String>(); // TODO show to the mentor acoirding the UML diagram

    public void Product(){

    }

    public void Product(String name, float defaultPrice, Currency defaultCurrency){
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getDefaultPrice(){
        return this.defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice){
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency(){
        return this.defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency){
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory(){
        return this.productCategory;
    }

    public void setProductCategory(ProductCategory productCategory){
        this.productCategory = productCategory;
    }

    public Supplier getSupplier(){
        return this.supplier;
    }

    public void setSupplier(Supplier supplier){
        this.supplier = supplier;
    }

    public static List<Product> getAllProductsBy(ProductCategory productCategory){
        // TODO I dont know what to do;
    }

    public static List<Product> getAllProductBy(Supplier supplier){
        // TODO I still don't know what to do
    }

    public String toString(){
        // TODO check the requirements
    }

}
