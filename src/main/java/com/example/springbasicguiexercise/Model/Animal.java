package com.example.springbasicguiexercise.Model;

public class Animal {
    private String species;
    private String name;
    public Animal(String species, String name){
        this.species=species;
        this.name=name;

    }
    public String getspecies(){
        return species;

    }
    public void setspecies(){
        this.species=species;
    }
    public String getname(){
        return name;
    }

    public void setname(){
        this.name=name;
    }



}
