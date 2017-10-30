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
    
    
    public static void main(String[] args) {
        Exercici1JSP game = new Exercici1JSP();
        game.run();
    }
    /**
     * This method will run the program
     * @author oliverG
     * @version 1.0
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
    /**
     * Method that you put a message and return the answer at this message
     * @author oliverG
     * @version 1.0
     * @param message
     * @return string
     */
    private String inputString(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        return answer;
    }
    /**
     * This method recive a string and transform vocals to UPPER
     * @author oliverG
     * @version 1.0
     * @param name
     * @return name 
     */
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
    /**
     * This method recive a string, count vocals and return how much vocals are.
     * @author oliverG
     * @version 1.0
     * @param name
     * @return count
     */
    private int toCountVocals(String name) {
        name.toLowerCase();
        int count = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    /**
     * This method recive a string, count consonants and return how much consonants are.
     * @author oliverG
     * @version 1.0
     * @param name
     * @return count
     */
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
