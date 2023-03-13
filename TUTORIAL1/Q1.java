/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TUTORIAL1;

import static TUTORIAL1.Telephone.numberOfTelephoneObject;

class Telephone{
    private String areaCode;
    private String number;
    static int numberOfTelephoneObject = 0;
    
    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    public String getAreaCode(){
        return areaCode;
    }
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    
    protected String makeFullNumber(){
        return areaCode + "-" + number;
    }
}

public class Q1 {
    public static void main(String[] args){
        Telephone[] t = {new Telephone("03","79676300"),
                         new Telephone("03","79676301"),
                         new Telephone("03","79676302"),
                         new Telephone("03","79676303"),
                         new Telephone("03","79676304"),
            }; 
        
        for(int counter = 0;counter < numberOfTelephoneObject;counter++){
            System.out.println(t[counter].makeFullNumber());
        }
    }
    
}
