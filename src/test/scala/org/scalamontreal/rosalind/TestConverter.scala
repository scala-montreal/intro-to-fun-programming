package org.scalamontreal.rosalind

import org.scalatest.FunSuite

/**
 * Tests for [[org.scalamontreal.rosalind.Converter]].
 */
class TestConverter extends FunSuite {

  test("should convert DNA to RNA") {
    val dna = "GATGGAACTTGACTACGTAAATT"
    val rna = Converter.dnaToRna(dna)
    assert(rna == "GAUGGAACUUGACUACGUAAAUU")
  }

}
