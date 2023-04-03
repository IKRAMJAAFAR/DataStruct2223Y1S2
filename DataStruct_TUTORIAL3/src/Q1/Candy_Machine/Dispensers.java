/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1.Candy_Machine;

/**
 *
 * @author weare
 */
final class Dispensers implements Slot {
    
    private int quantity;//declare the number of items
    private final Double price;//declare the price of item
    private final String product;//declare the product name
    
    //Constructor
    public Dispensers(String product, int quantity){
        this.product = product;
        this.price = setPrice();
        
        
        //to avoid overload on the system
        if(quantity <= containerSmall)
            this.quantity = quantity;
        else
            this.quantity = 10;
    }
    
    //Set price based on the product
    public double setPrice(){
        return switch(product){
            case "Cookies" -> 4.50;
            case "Gum" -> 4.00;
            case "Candies" -> 2.60;
            case "Chips" -> 3.20;
            default -> 0.00;
        };
    }
    
    //Call price
    public Double getPrice(){
        return price;
    }
    
    //Call product
    public String getProduct(){
        return product;
    }
    
    //Call quantity
    public int getQuantity(){
        return quantity;
    }
    
    @Override
    public void subtract(){
        quantity--;
    }
    
}
