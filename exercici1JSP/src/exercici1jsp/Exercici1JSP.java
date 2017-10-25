package exercici1jsp;
import java.util.*;
import java.lang.*;
/**
 *Program that ask to user for his name and return
 * vocals in mayus, numbers of vocals, number of consonant
 * @author ogonzalez
 * @version 1.0 10/2017
 */ 
public class Exercici1JSP {
    
        String name = "oliver";
    
    public static void main(String[] args) {
        Exercici1JSP game = new Exercici1JSP();
        game.run();
    }
    /**
     * 
     */
    public void run() {
        String name = inputString("Cuál es tu nombre? ");
        name = name.toLowerCase();
        name = toUpperVocals(name);
        System.out.println(name);
        int countVoc = toCountVocals(name);
        int countCons = toCountCons(name);
        System.out.println("Hay "+countVoc+" vocales y "+countCons+" consonantes.");
    }
    
    private String inputString(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        return answer;
    }

    private String toUpperVocals(String name) {
        //bucle que recorra string caracter a carcter y lo meta en un array de char
        char[] charArray = name.toCharArray();
        for(int i=0;i<charArray.length;i++){            
            if(charArray[i]=='a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u'){
              charArray[i] = Character.toUpperCase(charArray[i]);
            }
            
        }
        name = new String(charArray);
        return name;
    }

    private int toCountVocals(String name) {
        int count = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

    private int toCountCons(String name) {
        int count = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) !='a' || name.charAt(i) != 'e' || name.charAt(i) != 'i' || name.charAt(i) != 'o' || name.charAt(i) != 'u'){
                count++;
            }
        }
        return count;
    }
    
}
