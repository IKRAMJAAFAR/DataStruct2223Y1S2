/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author weare
 */
public abstract class StorePair implements Comparable{
    
    private int first, second;
    public StorePair(int first, int second) {
    this.first = first;
    this.second = second;
    }
    public int getFirst() {
    return first;
    }
    public int getSecond() {
    return second;
    }
    public void setPair(int first, int second) {
    this.first = first;
    this.second = second;
    }
    @Override
    public String toString() {
    return "first = " + first + " second = " + second;
    }
    public Object equals(){
        return first == second;
    }
    
    public int compareTo(){
        return Math.abs(first - second);
    }
}
