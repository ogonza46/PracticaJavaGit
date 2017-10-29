package Exercici2;
import java.lang.*;

/**
 * Exercici2 modul 15_UF1
 * @author jsauch
 */
public class Exercici2 {
    /**
     * String gString the given string.
     * String rString the reversed given string.
     */
    String gString;
    String rString; 

    public Exercici2(String gString) {
        this.gString = specialChars(gString);
        this.rString = reverseString();
    }

    public Exercici2() {
    }
    
    public void setgString(String gString) {
        this.gString = specialChars(gString);
        this.rString = reverseString();
    }
    
    public String getgString() {
        return gString;
    }
    
    public String getrString() {
        return rString;
    }
    
    /**
     * Cleans the input string from white spaces and/or punctuaction marks.
     * @param clString the string to be cleaned.
     * @return  outString the cleaned string.
     */
    private String specialChars (String inString) {
        String outString = inString.toLowerCase().replaceAll("[ .,;:'`´`!?¿¡]", "");
        return outString;
    }
    
    /**
     * Reverses the given string 
     * @param string the string to reverse 
     * @return the reversed string.
     */
    private String reverseString (){
        StringBuilder revString = new StringBuilder(gString);
        return revString.reverse().toString();
    }
    
    /**
     * Checks if a string is a palindrome.
     * @param gString the original string.
     * @param rString the reversed string.
     * @return true if the string is palindrome false if the string isn't.
     */
    public boolean palindrom (){
        boolean flag=true;
        for(int i=0;i<gString.length();i++){
            if(gString.charAt(i)!=rString.charAt(i)){
                flag=false;
                i=gString.length();
            }
        }
        
        return flag;
    }
    
    
}
