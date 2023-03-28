/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author weare
 * @param <E>
 */
public class StorePairGeneric<E extends Comparable<E>>{
    private E first,second;
    
    public final void setPair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    public E getFirst(){
        return first;
    }
    
    public E getSecond(){
        return second;
    }
    
    @Override
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    public StorePairGeneric(E first, E second){
        setPair(first,second);
    }
    
    public Object equals(){
        return first.equals(second);
    }
    
    public int compareTo(){
        return first.compareTo(second);
    }
    
}