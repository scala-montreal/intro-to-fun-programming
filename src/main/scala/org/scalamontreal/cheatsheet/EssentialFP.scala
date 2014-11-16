package org.scalamontreal.cheatsheet

import scala.annotation.tailrec

object EssentialFP {

  // use 'val' to define values (i.e. immutable reference)
  // the type annotation follows the value name
  val title: String = "Essential Scala"
  val anotherTitle = "Type annotation can be omitted, the compiler will infer it."

  // conditionals
  if(title.isEmpty) {
    //
  } else {
    //
  }

  // conditionals (and almost everything else) are expressions: they 'return' a value
  // this is equivalent to Java's "ternary" operator
  val emptiness = if(title.nonEmpty) "not empty" else "empty"

  // define a function using the 'def' keyword
  // annotated the type of each parameter and of the return value
  // don't forget the '='
  def add(operand1: Int, operand2: Int): Int = {
    // you don't need an explicit return
    // the result of the last expression is the value returned by the function
    operand1 + operand2
  }
  add(1, 2)

  // functions are objects and can be assigned to vals
  val addAsVal = (o1: Int, o2: Int) => o1 + o2
  addAsVal(1, 2)

  // they can be passed as arguments to other functions
  // (Int) => Int is the type of a function that takes a Int and returns an Int
  def applyFunction(value: Int, f: (Int) => Int): Int = {
    f(value)
  }
  val timesThree = (v: Int) => v * 3
  applyFunction(3, timesThree)

  // functions can be anonymous
  applyFunction(3, (v: Int) => v * 3)

  // functions can build functions
  def adder(addMe: Int): Int => Int = {
    (value: Int) => value + addMe
  }
  val addTwo = adder(2)
  addTwo(3) // 5

  // a trait defines an abstract type
  // a trait can define attributes and methods
  // attributes and methods can be concrete or abstract (undefined)
  trait Apples {
    val color: String = "red" // concrete attribute
    def name: String // abstract method
    def format: String = { // concrete method
      name
    }
  }
  trait OtherTrait {}

  // class can 'extends' traits
  // class constructor parameters are passed as class arguments
  // notice the use of the 'with' keyword for subsequent traits
  class Spartan(bitterness: Int) extends Apples with OtherTrait {

    // any code in the body of the class is execute at construction
    // by default attributes and methods define in the class body have 'public' access
    private val awesomeness: Int = bitterness * 2

    // class need to override abstract members of be 'abstract'
    override def name: String = "spartan"
  }
  val myApple = new Spartan(2)
  myApple.name

  //objects are singleton
  //they are created lazily
  object TheApple extends Apples {
    override def name: String = "ze apple"
  }

  // case classes are class that exports there constructor parameters and can be use for pattern matching
  // case classes are often use for data objects
  case class User(name: String, age: Int)
  val john = User("john", 22) // for case classes the new operator can be omitted
  val JohnName = john.name
  val JohnAge = john.age

  // case classes can be deconstructed to extract attributes
  val User(name, age) = john

  // 'match' can be used for pattern matching
  // Any is the root of all classes (think Java Object)
  def matching(p: Any) = {
    p match {
      case "a" => // matching on value
      case a: Apples => a.name // matching on type
      case User(n, a) if a > 10 => // matching on structure with condition
      case _ => // matches all
    }
  }

  // generic types are between '[]'
  def applyFunctionToArg[T, U](f: T => U, arg: T): U = {
    f(arg)
  }
  def wrapInList[T](item: T) : List[T] = {
    List(item)
  }
  val l_12: List[Int] = applyFunctionToArg(wrapInList[Int], 12)

  // tuples can be created like the following
  // elements are accessed through the method _x where x is the position in the tuple (starting from 1)
  val trio: (String, Int, Apples) = ("rico", 2333, new Spartan(2))
  val first = trio._1 //"rico"
  val second = trio._2 //2333
  val third = trio._3 //Spartan(2)

  //tuples can also be deconstructed
  val (k, v) = ("key", "value")

  //default Scala collection are immutable so modifications will return a new updated copy
  //sequence
  val oneTwoThree = Seq(1, 2, 3)

  //list
  val l = List(1, 2, 3)
  val prefixedList = 0 :: l // List(0, 1, 2, 3)

  //set
  val s = Set(1, 3, 4)
  val sPlus5 = s + 5 // Set(1, 3, 4, 5)

  //map
  val m = Map("k1" -> "v1", "k2" -> "v2")
  val mWithK3 = m + ("k3" -> "v3")
  m("k1")

  //collections have many useful methods check the doc
  l.filter((v: Int) => v < 2)
  l.map((v: Int) => v * 2)

  //for each item in 'l' then for each element in 's' generate the product
  for(i <- l; e <- s) yield i * e

  //recursion
  def sumAllFrom(value: Int): Int = {
    // always use the @tailrec annotation so force the compiler to check that the function is tail-recursive
    // (last call is the recursive call) so it can be optimized to a loop (you want that to avoid stack overflow)
    @tailrec
    def internalSum(value: Int, currentSum: Int): Int = {
      if (value == 0) {
        currentSum
      } else {
        internalSum(value - 1, currentSum + value)
      }
    }
    internalSum(value, 0)
  }
  sumAllFrom(4)
}
