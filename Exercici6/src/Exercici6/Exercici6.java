/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici6;

import java.util.*;

/**
 * Exercici 6 exercicis colaboratius.
 * @author Oliver Josep
 */
public class Exercici6 {
    
    String [] menu = {
      "Reverse sequence", "Count most repeated base", "Count less repeated base",
        "Recount bases", "exit"
    };
    public static void main(String[] args) {
        Exercici6 myApp =  new Exercici6();
        myApp.run();
    }
    
    public void run(){
        //TODO
        /*
        menu(); 
        reverse(); 
        countMax();
        countMin();
        countAll();
        exit;
        */
    }
    
    /**
     * shows the main menu of the application and reads
     * and option from the user.
     * @return an int with the option selected by user
     * or -1 in case of error.
     */
    private int menu() {
        //print menu
        for (int i=0; i<menu.length; i++) {
            System.out.format("%d. %s\n", i, menu[i]);
        }
        int option;
        System.out.print("Input an option: ");
        try {
            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();            
        } catch (InputMismatchException e) {
            option = -1;
        }       
        return option;
    }
    /**
     * 
     * @param seq
     * @return 
     */
    public String revSeq(String seq){
        //TODO
        return "ATTACA";
    }
    
    /**
     * 
     * @param seq
     * @return 
     */
    public int countMax(String seq){
        
        return 100;
    }
    
    /**
     * 
     * @param seq
     * @return 
     */
    public int countMin(String seq){
        
        return 0;
    }
    
    /**
     * 
     * @param seq
     * @return 
     */
    public Map countAll(String seq){
        Map <String, Integer> result;
        result = new HashMap<String, Integer>();
              
        return null;
    }
    
    public Scanner inputKeyb(){
        Scanner scan = new Scanner(System.in);
        return scan;
    }
    
    
}
