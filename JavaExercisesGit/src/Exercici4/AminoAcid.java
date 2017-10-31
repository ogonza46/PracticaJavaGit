/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici4;

import java.util.*;


/**
 * Aminoacid class for the exercise 4.
 * @author jsauch
 */
public class AminoAcid {
    
    /*
     * String aaSeq the aminoacid sequence
     * Map invGenCode the inverted genetic code with some of the possible values for the keys.
     */
    private String aaSeq;
    private boolean valid;
    private static final Map <String, String> invGenCode;
    static {
        invGenCode = new HashMap<String, String>();
        invGenCode.put("S","TCA"); // Serine
        invGenCode.put("F","TTC"); // Phenylalanine
        invGenCode.put("L","TTG"); // Leucine
        invGenCode.put("Y","TAC"); // Tyrosine
        invGenCode.put("C","TGC"); // Cysteine
        invGenCode.put("W","TGG"); // Tryptophan
        invGenCode.put("L","CTG"); // Leucine
        invGenCode.put("P","CCA"); // Proline
        invGenCode.put("H","CAT"); // Histidine
        invGenCode.put("Q","CAA"); // Glutamine
        invGenCode.put("R","CGT"); // Arginine
        invGenCode.put("I","ATA"); // Isoleucine
        invGenCode.put("M","ATG"); // Methionine
        invGenCode.put("T","ACT"); // Threonine
        invGenCode.put("N","AAC"); // Asparagine
        invGenCode.put("K","AAG"); // Lysine
        invGenCode.put("S","AGC"); // Serine
        invGenCode.put("R","AGA"); // Arginine
        invGenCode.put("P","CCC"); // Proline
        invGenCode.put("H","CAC"); // Histidine
        invGenCode.put("V","GTT"); // Valine
        invGenCode.put("A","GCT"); // Alanine
        invGenCode.put("D","GAC"); // Aspartic Acid
        invGenCode.put("E","GAG"); // Glutamic Acid
        invGenCode.put("G","GGA"); // Glycine
    }
    
    public AminoAcid(String aaSeq) {
        this.aaSeq = aaSeq;
        this.valid =  validAaSeq();
    }

    public AminoAcid() {
    }

    public String getAaSeq() {
        return aaSeq;
    }

    public void setAaSeq(String aaSeq) {
        this.aaSeq = aaSeq;
    }
    
    public boolean isValid() {
        return valid;
    }
    /**
     * Checks if the aminoacid sequence attribute of the object is valid or not.
     * @return false by default if the sequence doesn't match the regExp or true if it does.
     */
    private boolean validAaSeq() {
        boolean flag = false;
        if(aaSeq.matches("[ARNDCQEGHILKMFPSTWYV]*")){
            flag = true;
        }
        return flag;
    }
    
    /**
     * Re-translates into one of the possible dna sequences where tha aminoacid sequence came.
     * @return String with the the re-translated dna sequence or a error string if isn't valid and cannot be translated.
     */
    public String toDna() {
        String result="";
        for(int i=0;i<aaSeq.length();i++){
            String key =  aaSeq.substring(i,i+1);
            result = result.concat(invGenCode.get(key));
        }
        return result;
    }
}