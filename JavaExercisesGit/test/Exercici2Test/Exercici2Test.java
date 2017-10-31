/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Exercici2.Exercici2;

/**
 *
 * @author alumne
 */
public class Exercici2Test {
    static Exercici2 palindrome;
    
    public Exercici2Test() {
        
    }
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Testing exercici 2 class. Palindrome strings.");
        
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test ended.");
                
    }
    
    @Before
    public void before() {
        System.out.println("Testing for case:\n");
    }
        
    @Test
    public void testFirstString() {
        System.out.println("Ca, por al colomer! Temo home, tremolo. Clar? Opac?");
        String input = "Ca, por al colomer! Temo home, tremolo. Clar? Opac?";
        palindrome = new Exercici2(input);
        boolean result = palindrome.palindrom();
        boolean expected = true;
        assertEquals( result,expected);
        System.out.println("La cadena és palíndroma\n");
    }
    
    @Test
    public void testSecondString() {
        System.out.println("Aquesta cadena no és palindroma!");
        String input = "Aquesta cadena no és palindroma!";
        palindrome = new Exercici2(input);
        boolean result = palindrome.palindrom();
        boolean expected = false;
        assertEquals( result,expected);
        System.out.println("La cadena no és palíndroma\n");
        
    }
    
    @Test
    public void testThirdString() {
        System.out.println("Did Dean aid Diana? Ed did.");
        String input = "Did Dean aid Diana? Ed did.";
        palindrome = new Exercici2(input);
        boolean result = palindrome.palindrom();
        boolean expected = true;
        assertEquals( result,expected);
        System.out.println("La cadena és palíndroma\n");
        
    }
    
    @Test
    public void testFourthString() {
        System.out.println("Random string added here!");
        String input = "Random string added here!";
        palindrome = new Exercici2(input);
        boolean result = palindrome.palindrom();
        boolean expected = false;
        assertEquals( result,expected);
        System.out.println("La cadena no és palíndroma\n");
        
    }
        
}
