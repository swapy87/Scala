package org.demo

object function {
  
  def add(a:Int , b : Int) : Int=
  {
   a+b
  }
  def mul(a:Int ,b :Int) =a*b
  def main(args: Array[String])
  {
    println(add(10,20))
    println("Multiply result --->"+mul(20,30))
  }
}