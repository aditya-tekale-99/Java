// Author: Aditya Tekale

/* Program that determines whether there is a protein in a strand of DNA.
   dna1: Contains a protein.
   dna2: Does not contain a protein.
   dna3: Contains a protein. */

public class DNA{
public static void main(String[] args){
	String dna1 = "ATGCGATACGCTTGA";
	String dna2 = "ATGCGATACGTGA";
	String dna3 = "ATTAATATGTACTGA";
	
  //replace here (dna1, dna2, dna3)
	String dna = dna3;
	
	dna.length();
	
	int ATG = dna.indexOf("ATG");
	int TGA = dna.indexOf("TGA");
	
	int sequenceDifference = ATG - TGA;
	
	if (dna.contains("ATG") && dna.contains("TGA") && (sequenceDifference % 3) == 0) {
		System.out.println("Does contain protein!");
	} else {
		System.out.println("Does not contain protein!");
	}
}
}
