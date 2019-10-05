package org.demo
/*
 * function which uses one more variable outside the function
 * 
 */
object Closure {
  var num =10
  
  val add =(x : Int ) =>x+num
  def main(args : Array[String])
  {
    println(add(20))
  }
}