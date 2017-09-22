package com.examples.scala.basic


object Expressions {

  def main(args: Array[String]): Unit = {

    // You can write expressions within curly braces, The last written value is automatically returned
    val a: Int = {
      val b = 10; val c = 20; b + c
    }

    /* Semicolons are optional in scala. Use semicolons to separate multiple statements in the same line.
     However if you write each statment in a new line, semicolon is optional */
    val x = {
      val y = 5
      val z = 10
      y + z
    }

    println(s"a = $a")
    println(s"x = $x")
  }
}
