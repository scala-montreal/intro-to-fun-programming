package org.scalamontreal.rosalind

object Converter {

  /**
   * Setup for [[http://rosalind.info/problems/dna/]]
   * This is given as an example with the corresponding test in org.scalamontreal.rosalind.TestConverter.
   *
   * An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.
   * Given a DNA string t corresponding to a coding strand, its transcribed RNA string u is formed by
   * replacing all occurrences of 'T' in t with 'U' in u.
   *
   * FURTHER EXPLORATION:
   *
   * This is a pretty poor implementation and you might want to push it further. A few possible improvements:
   * - What if the String passed as an argument contains other characters than A, C, G or T?
   *   Don't use exceptions! Check out [[Option]] or [[Either]]
   * - Could we eliminate this problem completely by defining types for DNA and RNA strings?
   *   The function signature could look like
   * {{{
   *   def dnaToRna(dna: DNAString): RNAString
   * }}}
   * - What if we wanted to convert only the part of the DNA string that we need. How could we convert lazily as the
   *   client code 'reads' the RNA string?
   *
   * @param dna DNA string
   * @return the RNA string
   *
   */
  def dnaToRna(dna: String): String = {
    dna.map((c: Char) => {
      c match {
        case 'T' => 'U'
        case other => other
      }
    })
  }

  /**
   * Setup for [[http://rosalind.info/problems/revc/]]
   *
   * In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.
   * The reverse complement of a DNA string s is the string sc formed by reversing the symbols of s,
   * then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC").
   *
   * FURTHER EXPLORATION:
   * Could we perform both operations by scanning the DNA string only once without using a for/while-loop?
   *
   * @param dna DNA string
   * @return the reverse complement of a DNA string
   */
  def reverseComplement(dna: String): String = {
    ???
  }

  /**
   * Setup for [[http://rosalind.info/problems/prot/]]
   *
   * The 20 commonly occurring amino acids are abbreviated by using 20 letters from the English alphabet (all letters except for B, J, O, U, X, and Z).
   * Protein strings are constructed from these 20 symbols. Henceforth, the term genetic string will incorporate protein strings along with DNA strings and RNA strings.
   * The RNA codon table dictates the details regarding the encoding of specific codons into the amino acid alphabet.
   *
   * Given: An RNA string s corresponding to a strand of mRNA (of length at most 10 kbp).
   * Return: The protein string encoded by s.
   *
   * RNA codon table
   *
   * UUU F      CUU L      AUU I      GUU V
   * UUC F      CUC L      AUC I      GUC V
   * UUA L      CUA L      AUA I      GUA V
   * UUG L      CUG L      AUG M      GUG V
   * UCU S      CCU P      ACU T      GCU A
   * UCC S      CCC P      ACC T      GCC A
   * UCA S      CCA P      ACA T      GCA A
   * UCG S      CCG P      ACG T      GCG A
   * UAU Y      CAU H      AAU N      GAU D
   * UAC Y      CAC H      AAC N      GAC D
   * UAA Stop   CAA Q      AAA K      GAA E
   * UAG Stop   CAG Q      AAG K      GAG E
   * UGU C      CGU R      AGU S      GGU G
   * UGC C      CGC R      AGC S      GGC G
   * UGA Stop   CGA R      AGA R      GGA G
   * UGG W      CGG R      AGG R      GGG G
   *
   * @param rna RNA string
   * @return The protein string
   */
  def rnaToProtein(rna: String): String = {
    ???
  }
}
