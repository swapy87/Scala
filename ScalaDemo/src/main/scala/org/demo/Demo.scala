package org.demo

class Demo (var  id :String , var Name :String){
  var apply = new Demo("1","Swapnil")
}

object Demo
{
  
  def main (args:Array[String])
  {
   val swapy = new Demo("","")
   println(swapy)
  }
}