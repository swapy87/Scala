package org.demo

object LoopList {
  def main(args :Array[String])
  {
    var list =List(1,2,3,4,5,6,7,8,9)
    for(i<-list)
    {
      println(s"in the list $i")
    }
    //for with condition
    for(i <- list; if i<6)
    println("in condition loop"+i)
    
    //for loop as a expression
    val result = for {i<-list ; if i <5} yield{
      i*i
    }
    print("result----> " +result)
  }
}