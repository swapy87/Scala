package org.demo

object Lists {
  val lst= List(1,2,3,4,5,6,7)
  val name = List("swapnil", "Gokul", "Bayko")
  
  def main (args : Array[String])
  {
    print(lst +"\n")
    print(name+"\n")
    //Cons
    print(1::lst) // it will not modify the list just con the 1 infront of list
    println(1::2::3::Nil)
    println(lst.head +"---------" +lst.tail)
    println(lst.reverse)
    println(List.fill(5)(5))  // ()first indicate number of element and () indicate values to be repeated 
    //for each use cases
    lst.foreach(println)
     var sum : Int =0
    lst.foreach(sum+= _) // sum of all the value in list
    println(sum)
    
    name.foreach(println)
    
    println(lst(5))
  }
}