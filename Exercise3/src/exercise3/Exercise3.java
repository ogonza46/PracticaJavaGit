package exercise3;

import java.util.*;
import java.lang.*;

/**
 *  Program that ask the user to put and DNA or RNA sequence
 * and display transcription
 * @author oliver
 * @version 1.0 10/17
 */
public class Exercise3 {
    
    private final String [] menuOptions = {
        "Exit", "Introduce a DNA sequence",
        "Introduce a RNA sequence"
    };
    
    private Exercise3 trans;
    public static void main(String[] args) {
        Exercise3 Trans = new Exercise3();
        Trans.run();
    }
    
    private void run() {
        boolean exit = false;
        do {
            //print menu and get user choice
            int option = showMenuAndReadOption();
            //process option.
            switch (option) {
                case 0: //exit
                    exit = true;
                    break;
                case 1: //DNA sequence
                    String dna = inputString("Introduce a DNA sequence: ");
                    String transD = transcription(dna);
                    System.out.println(transD);
                    break;                
                case 2: //RNA sequence
                    String rna = inputString("Introduce a RNA sequence: ");
                    String transR = transcription(rna);
                    System.out.println(transR);
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
            
        } while(!exit);
        System.out.println("Exitting application!"); 
    }
    /**
     * shows the main menu of the application and reads
     * and option from the user.
     * @return an int with the option selected by user
     * or -1 in case of error.
     */
    private int showMenuAndReadOption() {
        //print menu
        for (int i=0; i<menuOptions.length; i++) {
            System.out.format("%d. %s\n", i, menuOptions[i]);
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
     * displays a message and gets an answer from the user.
     * @param message to display
     * @return answer from user or null in case of error.
     */
    private String inputString(String message) {
        System.out.print(message);
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        return answer;
    }
    /**
     * This method recive a dna or rna sequence, check kind of sequence and transcipt
     * @param sequence
     * @return transcription
     */
    private String transcription(String sequence) {
        sequence.toLowerCase();
        char [] letters = {'b', 'd','f','h','i','j','k','l','m','n','o','p'
                ,'q','r','s','v','w','x','y','z'};
        String string = "";
        if(sequence.contains("u")){
            string = sequence.replace("u", "t");
        }else if (sequence.contains("t")){
            string = sequence.replace("t", "u");
        }else{
            string = "Error, cannot read this format.";
        }
        return string;
    }
    
}
