package com.team.olympics.product;

import java.util.ArrayList;

/**
 * @author: Gu HungJou
 * @date: 2021/10/31 20:44
 * Describe:
 */
public class product {
    protected String productName;
    protected String producedDate;
    protected String chefName;
    protected String price;
    protected boolean state=true;
    protected ArrayList<String> ingredientList;
    protected void setName(String name){
    }
    public String getName(){
    return null;
    }
    public boolean getState(){
        return this.state;
    }
    protected void gotoNextState(){
        this.state=false;
    }
    protected void setProducedDate(String date){
    }
    public String getProducedDate(){
        return null;
    }
    protected void setChefName(String chefName){
    }
    public String getChefName(){
        return null;
    }

    public String getPrice() {
        return null;
    }

    protected void setPrice(String price) {
    }
    public void producing(){
    }
    public void packing(){
    }
    public void initIngredientList(){
        ingredientList=null;
    }
}
