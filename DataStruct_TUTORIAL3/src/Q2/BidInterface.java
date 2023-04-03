/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Q2;

/**
 *
 * @author weare
 */
//Bid for installing air conditioning unit
public interface BidInterface{
    

    /***
     * 
     * @return Name of the company in String form
     */
    String getNameCompany();
    
    /***
     * 
     * @return the description of the air conditioning unit
     *          in String form
     */
    String getDesc();
    
    /***
     * 
     * @return capacity of the bid in tons
     * where each ton equals to 12*10^3 BTU
     * 
     * BTU is British Thermal Unit
     * Check the website below for more details
     * https://thedailythrive.org/what-is-btu-in-air-conditioner/
     * 
     */
    Double getCapacityBid();
    
    /***
     * 
     * @return  the seasonal efficiency of this bid's AC
     * in unit of SEER
     */
    Double getSEER();
    
    /***
     * 
     * @return the cost of this bid's AC
     */
    Double getCostBid();
    
    /***
     * 
     * @return the cost of installing this bid's AC.
     */
    Double getCostInstallBid();
    
    /***
     * 
     * @return the yearly cost of operating this bid's AC
     */
    Double getYearCostBid();
    
}
