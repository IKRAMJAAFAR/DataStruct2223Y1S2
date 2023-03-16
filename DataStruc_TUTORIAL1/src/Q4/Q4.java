/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

abstract class Vechicle{
    private double maxSpeed;
    protected double currentSpeed;

    public Vechicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
    };

    abstract void accelerate();

    public double getCurrentSpeed(){
        return currentSpeed;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }

}
// YES we can create instance of vechicle
public class Q4 {
    public Vechicle v;
}
