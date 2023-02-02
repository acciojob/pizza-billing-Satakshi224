package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;

    private int addTakeaway;

    private boolean ExtraCheeseAdded;
    private boolean ExtraToppingsAdded;
    private  boolean isTakeAwayAdded;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.ExtraCheeseAdded=false;
        this.ExtraToppingsAdded=false;
        this.isBillGenerated=false;
        this.isTakeAwayAdded=false;
        this.bill="";
      if(isVeg){
          this.price=300;
          this.toppings=70;
      }
      else {
          this.price=400;
          this.toppings=120;
      }
      this.cheese=80;
      this.bill += "Base Price Of The Pizza: " +this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ExtraCheeseAdded){
            this.price=this.price+cheese;
            this.ExtraCheeseAdded=true;

        }
    }

    public void addExtraToppings(){
       if(!ExtraToppingsAdded){
           this.price=this.price+toppings;
           ExtraToppingsAdded=true;

       }
    }

    public void addTakeaway(){
      if(!isTakeAwayAdded){
          this.price+=20;
          isTakeAwayAdded=true;
      }
    }

    public String getBill(){
        // your code goes here
        if(ExtraCheeseAdded){
            this.bill+="Extra Cheese Added: "+ this.cheese + "\n";
        }
        if(ExtraToppingsAdded){
            this.bill+="Extra Toppings Added: "+ this.toppings +"\n";
        }
        if(isTakeAwayAdded){
            this.bill+="Paperbag Added: "+"20"+ "\n";

        }
        this.bill+="Total Price: "+ this.price + "\n";
        isBillGenerated=true;
        return this.bill;
    }
}
