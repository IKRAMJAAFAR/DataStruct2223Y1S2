/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author weare
 */
public class MyGeneric<E> {
    private E e;
    
    public MyGeneric(){
        
    }
    public MyGeneric(E e){
        this.e = e;
    }
    public E getE(){
        return e;
    }
    public void setE(E e){
        this.e = e;
    }
}
