/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
public class TestQ1 {
    static MyGeneric<String> strObj = new MyGeneric();
    static MyGeneric<Integer> intObj = new MyGeneric();
    
    public static void main(String[] args) {
        //Entering the values in the MyGeneric objects
        strObj.setE("Hello World!");
        intObj.setE(420);
        
        //Displaying MyGeneric objects
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
