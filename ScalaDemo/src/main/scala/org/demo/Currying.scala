package org.demo
/*
 * currying is technique transform 
 * multiple argument function
 * to single argument function
 */
object Currying {
  
  def add1(a:Int ,b :Int ,c:Int) = a+b+c //Normal
  def add2(a :Int)= (b:Int) =>a+b //Currying
  def add3(a : Int)(b :Int) = a+b
  
  def main (args: Array[String])
  {
    println("add1 "+add1(10,20,30))
    println("add2 "+add2(10)(50))
    println("add3 "+add3(40)(50))
//Diffrent
    var sum2= add2(40)
    println("add2 --> diffrnt   ->"+sum2(60))
    val sum3 =add3(50)_
    println("add3======> "+ sum3(50))
  }
}