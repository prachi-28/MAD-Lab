package com.example.myapplication;

public class courseModel {
    private String cardName;
   // private int imgid;

    public courseModel(String cardName)
    {
        this.cardName=cardName;
        //this.imgid=imgid;
    }

    public String getCardName(){
        return cardName;
    }

    /*public int getCardId(){
        return imgid;
    }*/

    public void setCardName(){
        this.cardName=cardName;
    }

   /* public void setCardId(){
        this.imgid=imgid;
    }*/
}
