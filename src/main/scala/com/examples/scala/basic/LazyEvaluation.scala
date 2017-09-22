package com.examples.scala.basic


object LazyEvaluation {

  def main(args: Array[String]): Unit = {

    val x = 100 // the moment i declare it, memory is initialized

    /**Lazy declaration. memory is allocated and this variable is committed to memory only on operation is called upon.
      eg: Useful when we have a large list, we do not have to load everything to the memory.
    Loads only the required elements based on the calculation
      - helps to delay the costly initialisation
      */
    lazy val y = 100
    lazy val z = (1 to 100000).toList
    val sum = z.reduce(_+_) //Z is initialized only when the action is called upon
    println(s"sum: $sum")

  }

}
