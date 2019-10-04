package org.demo

object Loop {
  
  def main (args : Array[String])
  {
    // Range method
    for(i <- 1 to 5)
    {
      println(i+"--> range")
    }
    // to method
    for(i <- 1.to(5))
    {
      println("to method")
    }
    //until
    for(i <- 1.until(5))
    {
      println("until method ")
    }
    
   for(i <- 1 to 5 ; j <- 1 to 6)
   {
     println(s"i--->$i  j---->$j")
   }
    
    
  }
}