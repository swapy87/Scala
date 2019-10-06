package org.demo

object Tupless {
  val mytuples1= (1,2,"swapnil", true)
    val myTuples2 = new Tuple3(1,"saa",("sim","baaa"))
  
  def main(args: Array[String]): Unit = {
    println(mytuples1)
    println(myTuples2)
    //Access the element using indexing
    println(mytuples1._3)
    mytuples1.productIterator.foreach(println)
    //map tuple
    println(1->true)
    
  }
}