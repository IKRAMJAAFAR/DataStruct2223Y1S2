/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author weare
 * @param <T>
 */
public class ArrayBag<T> implements BagInterface<T> {
    
    private T[] bag;
    private final Integer DEFAULT_CAPACITY = 25;
    private Integer numberOfEntries = 0;

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return getCurrentSize() == DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return getCurrentSize() == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(getCurrentSize() < DEFAULT_CAPACITY){
            T[] newBag;
            numberOfEntries = getCurrentSize() + 1;
            newBag = (T[]) new Object[numberOfEntries];
            for(int count = 0;count < numberOfEntries;count++){
                if(count == getCurrentSize() - 1){
                    newBag[count] = newEntry;
                }
                else if(bag != null){
                    newBag[count] = bag[count];
                }
            }
            bag = (T[]) new Object[numberOfEntries];
            bag = newBag;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public T remove() {
        if(!isEmpty()){
            java.util.Random rand = new java.util.Random();
            int kill = rand.nextInt(getCurrentSize());
            
            T output = bag[kill];
            T[] newBag = (T[]) new Object[getCurrentSize() - 1];
            
            int el = 0;
            for(int count = 0;count < getCurrentSize();count++){
                if(count != kill)
                    newBag[el++] = bag[count];
            }
            bag = (T[]) new Object[getCurrentSize() - 1];
            bag = newBag;
            return output;
        }
        else
            return null;
    }

    @Override
    public boolean remove(T anEntry) {
        if(getFrequencyOf(anEntry) != 0 && contains(anEntry)) {
            T[] newBag =(T[]) new Object[getCurrentSize() - 1];
            int count = 0,target = 0;
            
            for(;count < getCurrentSize();count++){
                if(bag[count] == anEntry){
                    target = count;
                    break;
                }
            }
            T remove = bag[target];
            count = target = 0;
            for(T check:bag){
                if(check != remove){
                    newBag[count++] = bag[target];
                }
                target++;
            }
            
            bag =(T[]) new Object[getCurrentSize() - 1];
            bag = newBag;
            return true;
        } 
        else
            return false;
    }

    @Override
    public void clear() {
        bag = (T[]) new Object[0];
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        int freq = 0;
        for(T check:bag){
            if(check == anEntry){
                freq++;
            }
        }
        return freq;
    }

    @Override
    public boolean contains(T anEntry) {
        //Using linear search
        for(int count = 0;count < getCurrentSize();count++){
            if(bag[count] == anEntry){
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        return bag;
    }
    
    @Override
    public <T> BagInterface<T> union(BagInterface<T> other) {
        BagInterface<T> bagUnion = new ArrayBag<>();
        T[] array = other.toArray();
        for(int count = 0;count < getCurrentSize();count++){
            bagUnion.add((T) bag[count]);
        }
        for(T check:array){
            bagUnion.add((T) check);
        }
            return bagUnion;
    }

    @Override
    public <T> BagInterface<T> intersection(BagInterface<T> other) {
        BagInterface<T> bagIntersection = new ArrayBag<>();
        for(T check: (T[]) bag){
                if(other.contains(check) && !bagIntersection.contains(check)){
                    int min = Math.min(getFrequencyOf(check), other.getFrequencyOf(check));
                    for(int count = 1;count <= min;count++)
                        bagIntersection.add(check);
                }
            }
            return bagIntersection;
    }

    @Override
    public <T> BagInterface<T> difference(BagInterface<T> other) {
        BagInterface<T> bagIntersection = intersection(other);
        ArrayBag<T> bagDifference = new ArrayBag<>();
        for(T check: (T[]) bag){
            if(!bagDifference.contains(check)){
                int dif = getFrequencyOf(check) - bagIntersection.getFrequencyOf(check);
                    
                while(dif > 0){
                    bagDifference.add(check);
                    dif--;
                    }
            }
        }
        return bagDifference;
    }
    
    
}
