/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author weare
 */
import java.util.*;
import java.io.*;

public class Q2 {
    static String filename = "text";
    final static String filenameEnd = ".txt";
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total;
        String special = "";
        for(;;){
            System.out.print("Select which file to be extracted [1,2,3,4]: ");
            total = s.nextInt();
            s.nextLine();
            if(total >= 1 && total <= 4){
                filename = filename + total + filenameEnd;
                break;
            }
            else
                System.out.println("Invalid entry.");
        }
        switch(total){
            case 1 -> special = ",";
            case 2 -> special = ", ";
            case 3 -> special = "; ";
            case 4 -> special = "";
        }
        total = 0;
        try{
            FileReader fr = new FileReader(filename);
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                
                while((line = br.readLine()) != null){
                    String[] split = line.split(special);
                    for(String sus : split){
                        total += sus.length();
                        System.out.print(sus);
                    }
                    System.out.println("");
                }
                System.out.println("Total characters: " + total);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
