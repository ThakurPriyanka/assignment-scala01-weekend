package edu.knoldus

import operation.Collatz
import org.apache.log4j.Logger

object Application {

  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val callatzObject = new Collatz
    val num1 = 52
    val num2 = 2
    val num3 = 4
    val num4 = 6
    val num5 = 88
    val list = List(num1, num2, num3, num4, num5)
    log.info(s"${callatzObject.collatzSequence(list, List())}")

  }
}

