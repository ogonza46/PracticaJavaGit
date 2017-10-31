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
    
    public void menu(){
        
    }
    /**
     * Reverses the introduced string.
     * @param seq
     * @return 
     */
    public String revSeq(String seq){
        StringBuilder result = new StringBuilder(seq);
        return result.reverse().toString();
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
