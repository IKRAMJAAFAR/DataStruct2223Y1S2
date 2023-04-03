/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Q2;

/**
 *
 * @author weare
 */

public interface BidCollectionInterface<E> {

    
    /**
     *
     * @param parameter
     * adding parameter into arrayList bid
     * 
     */
    void addBid(E parameter);
    
    /**
     * 
     * @return which Bid that has the best yearly cost
     * how to get?
     * use getYearCostBid() method.
     * find the one that is the max among the array
     * 
     */
    E bestYearCostBid();
    
    /**
     * 
     * @return the bid that is are max of total of unit cost and installation cost
     * Find the getCostBid() + getCostInstallBid()
     * find the one that is the max among the array
     * 
     */
    E bestInitialCostBid();
    
    
    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     *
     * @throws UnsupportedOperationException if the {@code clear} operation
     *         is not supported by this list
     */
    void clear();
    
    /**
     * Returns the number of elements in this list.  If this list contains
     * more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this list
     */
    int size();
    
    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements
     */
    public boolean isEmpty();
    
}
