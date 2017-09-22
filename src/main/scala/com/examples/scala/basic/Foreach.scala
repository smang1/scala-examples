package com.examples.scala.basic

object Foreach {

  def main(args: Array[String]): Unit = {
    val str = "test"
    /*Every collection in scala has a foreach method. it is used to iterates over each element*/
    str.foreach(println)
  }

}
