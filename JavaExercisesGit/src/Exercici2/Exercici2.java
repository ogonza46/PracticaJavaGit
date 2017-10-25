/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;
import java.lang.*;

/**
 * Exercici2 modul 15_UF1
 * @author alumne
 */
public class Exercici2 {
    /**
     * String gString the given string.
     * String rString the reversed given string.
     */
    String gString ;
    String rString; 

    public Exercici2(String gString) {
        this.gString = gString;
    }

    public Exercici2() {
    }
        
    public String getgString() {
        return gString;
    }

    public void setgString(String gString) {
        this.gString = gString;
    }

    public String getrString() {
        return rString;
    }

    public void setrString(String rString) {
        this.rString = rString;
    }
    
    
        
    public static void main (String[] args) {
        Exercici2 myApp = new Exercici2();
        myApp.run();
    }
    /**
     * 
     */
    public void run(){
        gString = gString.toLowerCase().replaceAll("[ .,`´`!?¿¡]", "");
        System.out.println(gString);
        String rString = reverseString(gString);
        if(palindrom(gString, rString)){
            System.out.println("La cadena és palíndroma.");
        } else{
            System.out.println("La cadena NO és palíndroma.");
        }
    }
    
    /**
     * Reverses the given string 
     * @param string the string to reverse 
     * @return the reversed string.
     */
    public String reverseString (String string){
        StringBuilder revString = new StringBuilder(string);
               
        return revString.reverse().toString();
    }
    
    /**
     * Checks if a string is a palindrom.
     * @param gString the original string.
     * @param rString the reversed string.
     * @return true if the string is palindrom false if the string isn't.
     */
    public boolean palindrom (String gString, String rString){
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
