package org.demo

object OperatorFunction {
  
  object Math
  {
    def +(a :Int , b : Int) :Int=a+b
    def **(a:Int) =a*a 
  }
  def main (args : Array[String])
  {
    println("Square -->"+Math.**(10))
    println("Add -->"+Math.+(10, 20))
  }
}