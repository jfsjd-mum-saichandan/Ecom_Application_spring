package com.ecom.ecom;
import org.springframework.beans.factory.annotation.Autowired;

public class Clothes implements Product{
        private String Name;
        private String Type;
            @Autowired
            public void setName(String Name){
                this.Name = Name;
            }
            @Autowired
            public void setType(String Type){
                this.Type = Type;
            }
            @Override
            public void productDetails(){
            System.out.println("PRODUCT DETAILS :-");
            System.out.println("Name of Clothes product is :- " +this.Name);
        }
            @Override
            public void productType(){
            System.out.println("Brand of Clothes product is :- " +this.Type);
            System.out.println("-----------------------------------------------------" );
    }
}
