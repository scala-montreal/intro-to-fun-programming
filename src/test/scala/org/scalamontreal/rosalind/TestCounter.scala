package org.scalamontreal.rosalind

import org.scalatest.FunSuite

/**
 * Tests for [[org.scalamontreal.rosalind.Counter]].
 */
class TestCounter extends FunSuite {

    test("should count nucleotides in a DNA string") {
      val dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"
      val (aCount, cCount, gCount, tCount) = Counter.countNucleotides(dna)
      assert(aCount == 20)
      assert(cCount == 12)
      assert(gCount == 17)
      assert(tCount == 21)
    }
}
