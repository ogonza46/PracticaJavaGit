/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici4;

import java.util.*;

/**
 * Dna class for the exercise 4.
 * @author jsauch
 */
public class Dna {
    /*
    * String dnaSeq dna sequence.
    * Boolean valid if true the dna sequence is well constructed and can be translated to AA if false the dna cannot be translated.
    * Map geneticCode hashmap with all the translations for the 20 AA.
    */
    private String dnaSeq;
    private boolean valid;
    private static final Map <String, String> geneticCode;
    //static initializer for the geneticCode hash.
    static {
        geneticCode = new HashMap<String, String>();
        geneticCode.put("TCA","S"); // Serine
        geneticCode.put("TCC","S"); // Serine
        geneticCode.put("TCG","S"); // Serine
        geneticCode.put("TCT","S"); // Serine
        geneticCode.put("TTC","F"); // Phenylalanine
        geneticCode.put("TTT","F"); // Phenylalanine
        geneticCode.put("TTA","L"); // Leucine
        geneticCode.put("TTG","L"); // Leucine
        geneticCode.put("TAC","Y"); // Tyrosine
        geneticCode.put("TAT","Y"); // Tyrosine
        geneticCode.put("TAA","_"); // Stop
        geneticCode.put("TAG","_"); // Stop
        geneticCode.put("TGC","C"); // Cysteine
        geneticCode.put("TGT","C"); // Cysteine
        geneticCode.put("TGA","_"); // Stop
        geneticCode.put("TGG","W"); // Tryptophan
        geneticCode.put("CTA","L"); // Leucine
        geneticCode.put("CTC","L"); // Leucine
        geneticCode.put("CTG","L"); // Leucine
        geneticCode.put("CTT","L"); // Leucine
        geneticCode.put("CCA","P"); // Proline
        geneticCode.put("CAT","H"); // Histidine
        geneticCode.put("CAA","Q"); // Glutamine
        geneticCode.put("CAG","Q"); // Glutamine
        geneticCode.put("CGA","R"); // Arginine
        geneticCode.put("CGC","R"); // Arginine
        geneticCode.put("CGG","R"); // Arginine
        geneticCode.put("CGT","R"); // Arginine
        geneticCode.put("ATA","I"); // Isoleucine
        geneticCode.put("ATC","I"); // Isoleucine
        geneticCode.put("ATT","I"); // Isoleucine
        geneticCode.put("ATG","M"); // Methionine
        geneticCode.put("ACA","T"); // Threonine
        geneticCode.put("ACC","T"); // Threonine
        geneticCode.put("ACG","T"); // Threonine
        geneticCode.put("ACT","T"); // Threonine
        geneticCode.put("AAC","N"); // Asparagine
        geneticCode.put("AAT","N"); // Asparagine
        geneticCode.put("AAA","K"); // Lysine
        geneticCode.put("AAG","K"); // Lysine
        geneticCode.put("AGC","S"); // Serine
        geneticCode.put("AGT","S"); // Serine
        geneticCode.put("AGA","R"); // Arginine
        geneticCode.put("AGG","R"); // Arginine
        geneticCode.put("CCC","P"); // Proline
        geneticCode.put("CCG","P"); // Proline
        geneticCode.put("CCT","P"); // Proline
        geneticCode.put("CAC","H"); // Histidine
        geneticCode.put("GTA","V"); // Valine
        geneticCode.put("GTC","V"); // Valine
        geneticCode.put("GTG","V"); // Valine
        geneticCode.put("GTT","V"); // Valine
        geneticCode.put("GCA","A"); // Alanine
        geneticCode.put("GCC","A"); // Alanine
        geneticCode.put("GCG","A"); // Alanine
        geneticCode.put("GCT","A"); // Alanine
        geneticCode.put("GAC","D"); // Aspartic Acid
        geneticCode.put("GAT","D"); // Aspartic Acid
        geneticCode.put("GAA","E"); // Glutamic Acid
        geneticCode.put("GAG","E"); // Glutamic Acid
        geneticCode.put("GGA","G"); // Glycine
        geneticCode.put("GGC","G"); // Glycine
        geneticCode.put("GGG","G"); // Glycine
        geneticCode.put("GGT","G"); // Glycine
    }

    public Dna(String dnaSeq) {
        this.dnaSeq = dnaSeq;
        this.valid = validDnaSeq();
    }

    public Dna() {
    }

    public String getDnaSeq() {
        return dnaSeq;
    }

    public void setDnaSeq(String dnaSeq) {
        this.dnaSeq = dnaSeq;
        this.valid = validDnaSeq();
    }

    public boolean isValid() {
        return valid;
    }
   
    /**
     * Checks if the dna sequence attribute of the dna object is valid or not.
     * @return false by default if the sequence don't pass the regexp or true if the sequence pass the regexp and its valid.
     */
    private boolean validDnaSeq(){
        boolean flag = false;
        if(dnaSeq.matches("[ACTG]*")){
            flag = true;
        }
        return flag;
    }
    
    /**
     * Translates the dna sequence into a string of aminoacids and returns its result if the sequence is valid.
     * @return String with the the translated aa sequence or a error string if isn't valid and cannot be translated.
     */
    public String toAminoAcids (){
        String result = "DNA sequence not valid, cannot be translated.";
        if(valid){
            result="";
            for(int i=0;i<dnaSeq.length();i+=3){
                String key =  dnaSeq.substring(i, i+3);
                result = result.concat(geneticCode.get(key));
                
            }
        }
        return result;
    }
    
    
    
}
