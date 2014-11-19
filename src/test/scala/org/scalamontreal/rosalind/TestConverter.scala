package org.scalamontreal.rosalind

import org.scalatest.FunSuite

/**
 * Tests for [[org.scalamontreal.rosalind.Converter]].
 */
class TestConverter extends FunSuite {

  test("should convert a DNA string to a RNA string") {
    val dna = "GATGGAACTTGACTACGTAAATT"
    val rna = Converter.dnaToRna(dna)
    assert(rna == "GAUGGAACUUGACUACGUAAAUU")
  }

  test("should reverse complement a DNA string") {
    val dna = "AAAACCCGGT"
    val reverseComplement = Converter.reverseComplement(dna)
    assert(reverseComplement == "ACCGGGTTTT")
  }

  test("should convert RNA string to a protein string") {
    val rna = "AUGGCCAUGGCGCCCAGAACUGAGAUCAAUAGUACCCGUAUUAACGGGUGA"
    val proteinString = Converter.rnaToProtein(rna)
    assert(proteinString == "MAMAPRTEINSTRING")
  }

}
