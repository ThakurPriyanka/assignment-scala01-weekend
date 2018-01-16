package edu.knoldus.operation

class Collatz {

  def collatzSequence(list: List[Int], resultList: List[Int]): List[Int] = {

    def checkNumber(number: Int, resultList: List[Int]): Boolean = {
      resultList match {
        case head :: tail if head != number => checkNumber(number, tail)
        case head :: _ if head == number => false
        case Nil => true
      }
    }

    list match  {
      case head :: tail  if checkNumber(head, resultList) && head % 2 == 0 => collatzSequence(head / 2 :: tail,head::resultList)
      case head :: tail  if checkNumber(head, resultList) && head % 2 != 0 => collatzSequence((3 * head + 1 ) :: tail,head::resultList)
      case head :: tail  if !checkNumber(head, resultList)  => collatzSequence(tail,resultList)
      case Nil => resultList
    }
  }
}

