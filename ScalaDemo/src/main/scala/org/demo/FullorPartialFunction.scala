package org.demo

object FullorPartialFunction {
  
  val sum = (a : Int, b:Int ,c : Int) =>a+b+c
  def main (args : Array[String ]){// 
    
val sums=    sum(10,20 , _ :Int)
val result = sums(50)


println(result)
  }
}