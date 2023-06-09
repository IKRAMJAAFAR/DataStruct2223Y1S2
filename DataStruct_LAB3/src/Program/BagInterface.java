/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;
/**
An interface that describes the operations of a bag of objects.
 * @param <T>
*/
public interface BagInterface<T>{
    
    
        /** Gets the current number of entries in this bag.
         @return the integer number of entries currently in the bag */
        public int getCurrentSize();
        
        
        /** Sees whether this bag is full.
         @return true if the bag is full, or false if not */
        public boolean isFull();
        
        
        /** Sees whether this bag is empty.
         @return true if the bag is empty, or false if not */
        public boolean isEmpty();
        
        
        /** Adds a new entry to this bag.
         @param newEntry the object to be added as a new entry
         @return true if the addition is successful, or false if not */
        public boolean add(T newEntry);
        
        
        /** Removes one unspecified entry from this bag, if possible.
         @return either the removed entry, if the removal was successful, 
         or null */
        public T remove();
        
        
        /** Removes one occurrence of a given entry from this bag.
         @param anEntry the entry to be removed
         @return true if the removal was successful, or false if not */
        public boolean remove(T anEntry);
        
        
        /** Removes all entries from this bag. */
        public void clear();
        
        
        /** Counts the number of times a given entry appears in this bag.
         @param anEntry the entry to be counted
         @return the number of times anEntry appears in the bag */
        public int getFrequencyOf(T anEntry);
        
        
        /** Tests whether this bag contains a given entry.
         @param anEntry the entry to locate
         @return true if this bag contains anEntry, or false otherwise */
        public boolean contains(T anEntry);
        
        
        /** Retrieves all entries that are in this bag.
         @return a newly allocated array of all the entries in the bag */
        public T[] toArray();
        
        /**
         * To create a new bag where all elements in both bags exist
         * 
         * REMINDER: Must be the same parameter T
         * 
         * 
        * @param <T>
         * @param other is the bag to be duplicated
         * @return a new bag where elements in both bags are duplicated 
         */
        public <T> BagInterface<T> union(BagInterface<T> other);
        
        /**Creates a new bag where duplicate elements exist
         * 
         * REMINDER: Must be the same parameter T
         * 
         * @param <T>
         * @param other is the bag to be checked
         * @return a new Bag where only duplicates from both bag exists
         */
        public <T> BagInterface<T> intersection(BagInterface<T> other);
        
        
        /**Creates a new bag where only unique elements of this bag exists
         * 
         * @param <T>
         * @param other is the bag to be negated
         * @return a new Bag where only intersection does not exist
         */
        public <T> BagInterface<T> difference(BagInterface<T> other);

} // end BagInterface
