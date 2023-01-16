package com.ecom.ecom;

    public class ElectronicsItem implements Product{

        private String Name;
        private String Type;

        
        public ElectronicsItem(String Name, String Type){
            this.Name = Name;
            this.Type = Type;
        }
        @Override
        public void productDetails(){
            System.out.println("PRODUCT DETAILS :-");
            System.out.println("Name of electronic product is :- " +this.Name);
        }
        @Override
        public void productType(){
            System.out.println("Brand of electronic product is :- " +this.Type);
            System.out.println("-----------------------------------------------------" );
        }
    }