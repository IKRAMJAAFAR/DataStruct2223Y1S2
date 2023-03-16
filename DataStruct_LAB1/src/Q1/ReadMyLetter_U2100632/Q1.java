/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1.ReadMyLetter_U2100632;

/**
 *
 * @author weare
 */
import java.io.*;
import java.util.*;

public class Q1 {
    final static String filename = "Ikram_U2100632.txt";
    final static File file = new File(filename);
    
    public static void main(String[] args) {
        
        //Part 1
        String line;
        try{
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(fr)) {
                while((line = br.readLine()) != null)
                    System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e);
        }
        
        //Part 2
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to write the letter? (Y for yes)");
        char check = s.nextLine().charAt(0);
        if(check == 'Y'){
            System.out.println("Typing....(Enter \"QUITANDENDANDNULL\" to exit)");
            try{
                FileOutputStream fos = new FileOutputStream(file,true);
                try (PrintWriter pw = new PrintWriter(fos)) {
                    for(;;){
                        line = s.nextLine();
                        if(line.equals("QUITANDENDANDNULL"))
                            break;
                        else
                            pw.println(line);
                    }
                }
            }catch(IOException e){
                System.out.println(e);
            }
            System.out.println("Text saved!");
        }
        System.out.println("Program Ended!");
        
    }
    
}
