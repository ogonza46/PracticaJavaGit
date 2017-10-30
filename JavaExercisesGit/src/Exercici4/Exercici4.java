/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici4;

import java.util.Scanner;

/**
 *
 * @author jsauch
 */
public class Exercici4 {
    
    public static void main(String[] args) {
        Exercici4 myApp = new Exercici4();
        myApp.run();
    }

    public void run() {
        boolean exit = false;
        int option;
        Scanner input = inputFromKeyb();
        do{
            input = inputFromKeyb();
            menu();
            try{
                option = input.nextInt();
                switch (option){
                    case 1: dnaToAA();
                    break;
                    case 2: aaToDna();
                    break;
                    case 3: exit = true;
                    break;
                    default: System.out.println("Select one of the options.");
                    break;
                }
            } catch(Exception e){
                System.err.println(e);
                System.out.println("Select one of the options.");
            }
                    
        }while(!exit);
        System.out.println("Application closed, have a nice en day.");
    }
    
    /**
     * Prints the menu of the application.
     */
    public void menu (){
        String menu =  "Select the option you want to execute: \n"
                + "1- DNA to AA \n"
                + "2- AA to DNA\n"
                + "3- Exit the application.\n";
        
        System.out.println(menu);
    }
    
    /**
     * Built in scanner for input purposes.
     * @return Scanner a new scanner object with the input system constructor.
     */
    public Scanner inputFromKeyb (){
        Scanner scan = new Scanner(System.in);
        return scan;
    }
    
    /**
     * Translates a dna sequence using the dna class.
     */
    private void dnaToAA() {
        Scanner input = inputFromKeyb();
        System.out.println("\nEnter a dna sequence: \n");
        Dna dnaSeq = new Dna(input.next());
        if(!dnaSeq.isValid()){
            System.out.println("The introduced DNA sequence is not valid.");
        } else{
            System.out.println(dnaSeq.toAminoAcids());
        }
        
    }
    
    /**
     * Re-translates back to a possible dna sequence an aminoacid sequence.
     */
    private void aaToDna() {
        Scanner input = inputFromKeyb();
        System.out.println("\nEnter an AA sequence: \n");
        AminoAcid aaSeq =  new AminoAcid(input.next());
        if(!aaSeq.isValid()){
            System.out.println("The introduced AA sequence is not valid.");
        }else{
            System.out.println(aaSeq.toDna());
        }
    }

    
}
