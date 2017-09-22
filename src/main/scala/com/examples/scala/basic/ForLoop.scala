package com.examples.scala.basic


object ForLoop {

  def main(args: Array[String]): Unit = {

    for(i <- 1 to 5) println(i)

    for(i <- 5 to 1) println(i) //No compilation error. contrary statement reducing the counter by +1, the condition itself is false

    for(i <- 5 to 1 by -1) println(i) //by specifying the step

    //nested loop
    for(i <- 1 to 5; j <- 5 to 4 by -1) println(s"($i, $j)")
  }

}
