/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author weare
 */
public class ComparableBook implements Comparable<ComparableBook>{

    private final String codeBook;
    private final String name;
    
    @Override
    public int compareTo(ComparableBook o) {
        if(codeBook.compareTo(o.codeBook) == 0){
            return name.compareTo(o.name);
        }
        else
            return codeBook.compareTo(o.codeBook);
    }
    
    public ComparableBook(Integer codeBook,String name){
        this.name = name;
        this.codeBook = String.valueOf(codeBook);
    }
    
}
