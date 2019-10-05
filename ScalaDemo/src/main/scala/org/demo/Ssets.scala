package org.demo

object Ssets {
  
  val sets1 = Set(1,2,3,4,5,6,7,8,9,10)
  val sets2 : Set[Int] =Set[Int](1,2,10,11,1,2,45,67)
  def main(args :Array[String])
  {
    sets1.foreach(println)
   println(sets1.++(sets2)) //print concanitated values from 2 lists
   println(sets1.intersect(sets2)) //print common values from 2 lists
  }
}