package org.demo

object Maps {
  val mapss :Map[Int,String] =Map(1->"swapnil", 2 ->"Popiii", 3->"Gokul")
  val maps1 = Map(1->"swapy",2->222 )
  
  def main (args:Array[String])
  {
    println(mapss)// print map
    mapss.foreach(println) //printing map value for each element
   println( mapss(1))// accesing element
   println(mapss.keySet)
  }
  }