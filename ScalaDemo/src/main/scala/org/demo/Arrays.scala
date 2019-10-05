package org.demo

object Arrays {
  
  val myarray : Array[Int] = new Array[Int](5);
  val newArray =new  Array[Int](5);
  val marray2 = Array(1,2,3,4,5,6,7)
  def main(args: Array[String]): Unit = {
    myarray(0)=20
    myarray(1)=30
    myarray(2)=40
    myarray(3)=50
    myarray(4)=60
    
//for(i <- myarray) println(i)
    myarray.foreach(println)
  }
}