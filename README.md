Introduction to Functional Programming
======================================

This repository initial code base for the November 19th 2014 meetup on functional programming.

Getting started!
----------------

1- Clone the repository with

    git clone git@github.com:scala-montreal/intro-to-fun-programming.git

2- Make sure Java 1.6 or higher installed on your machine. If not, install it [http://java.com/en/download/help/download_options.xml](http://java.com/en/download/help/download_options.xml).

3- Download and install [SBT](http://www.scala-sbt.org/download.html). SBT is a development tool used to compile, run and manage project's dependencies.

Compile and Run
---------------

Go into the project directory and on the command line run

    sbt compile

This will compile this project.

Run the tests using

    sbt test

Reactive compile/test loop (will recompile and re-run the test every time a source file has changed)

    sbt ~test

Using IDEA
----------

Any editor can be used in conjunction with SBT, but IntelliJ IDEA Scala support (via the Scala plugin) is very good.

For installation instructions, check out [https://www.jetbrains.com/idea/features/scala.html](https://www.jetbrains.com/idea/features/scala.html).

Project Structure
-----------------

    /src
      /main
        /scala
          /org
            /scalamontreal
              /cheatsheet
                /EssentialFP.scala - Minimal Scala syntax cheat-sheet for FP related features
              /rosalind
                /Converter.scala - Solution example and possible method signatures for conversion problems.
                /Counter.scala - Possible method signatures for counting problems
      /test
        /scala
          /org
            /scalamontreal
              /rosalind
                /TestConverter.scala - Tests for Converter.scala
                /TestCounter.scala - Tests for Counter.scala

Instructions
------------

For the hands-on part of the meetup, using FP techniques, you can try to solve problems from the [Rosalind problem database](http://rosalind.info/problems/list-view/).
You can also revisit the example solution in Converter.scala and try to address some of the solution shortcomings.

I recommend solving all of the suggested problems first and then have a shot at the *FURTHER EXPLORATION* sections.
