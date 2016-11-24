package models;

import java.models;


public class Product {

    private String id;

    private String name;

    private String desc;

    private String subcategory;

//same as in subcat: e.g. ['director', 'actors', 'age requirement']

    private String[] optionalTypes;

// then [ ['Spielberg'], ['Cumberbatch', 'John Cena'],  ['18'] ]
    private String[][] optionals;

    public String[] getOptional(String type){
    int index = Arrays.asList(optionalTypes).indexOf(type);
    return optionals[index];
    }



}