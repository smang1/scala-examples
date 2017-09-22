package com.examples.scala.basic


object BasicSteps {

  def main(args: Array[String]): Unit = {
    //Declare a variable in scala
    val a = 10; //immutable variable, the value of the variable cannot be changed; Data type is automatically inferred (Type inference)
    var b = 11; //mutable variable, the value of the variable cannot be changed; Data type is automatically inferred (Type inference)

    val c:Int = 10
    var d:Boolean = true

    println(s"a: $a")
    println(s"b: $b")
  }
}
