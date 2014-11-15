package org.scalamontreal.rosalind

object Converter {

  /**
   * This is given as an example with the corresponding test in org.scalamontreal.rosalind.TestConverter.
   *
   * This is a pretty poor implementation and you might want to push it further. A few possible improvements:
   * - What if the String passed as an argument contains other characters than A, C, G or T?
   *   Don't use exceptions! Check out [[Option]] or [[Either]]
   * - Could we eliminate this problem completely by defining types for DNA and RNA strings?
   *   The function signature could look like {{{
   *   def dnaToRna(dna: DNAString): RNAString
   *   }}}
   * - What if we wanted to convert only the part of the DNA string that we need. How could we convert lazily as the
   *   client code 'reads' the RNA string?
   */
  def dnaToRna(dna: String): String = {
    dna.map((c: Char) => {
      c match {
        case 'T' => 'U'
        case other => other
      }
    })
  }

}
