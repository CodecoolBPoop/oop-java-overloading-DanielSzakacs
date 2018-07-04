package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {

    private int id;
    private String name;
    private String description;

    public void Supplier(){

    }

    public void Supplier(String name, String description){

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

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<Product> getProducts(){
        // TODO I dont know
    }

    public String toString(){
        // TODO I dont know
    }

}
