package com.example.BeerAdviser;

import java.util.ArrayList;
import java.util.List;

public class ProductExpert {
    List<String> getProduct(String ProductType){
        List<String> product = new ArrayList<>();
        if(ProductType.equals("Mercancias Solidas")){
            product.add("Granos");
            product.add("Qumicos");
            product.add("Minerales");
        }
        else {
            if (ProductType.equals("Mercancias Liquidas")){
                product.add("Solvente");
                product.add("Aceite");
                product.add("Petroleo");
            }
            else {
                if (ProductType.equals("Mercancias Agricolas")){
                    product.add("Fertilizantes");
                    product.add("Cereales");
                    product.add("Semillas");
            }
                else {
                    if (ProductType.equals("Mercancia Textil")){
                        product.add("Seda");
                        product.add("Lino");
                        product.add("Algodon");


                    }
                }
        }
    }
        return product;
    }
    }
