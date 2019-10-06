package org.demo

object Map_flatmap_flatten_filter {
  
  val lst= List(1,2,3,4,5,6,7,9)
  val maps= Map(1->"swapy",2->"dhanjode",3->"Popi")
  def main(args: Array[String]): Unit = {
    println(lst.map(_*2)) 
    //or same as above
    println(lst.map(p=>p*2))
    //appending text to each element
    println(lst.map(_+"swapy is beast"))
    println(lst.filter(_>2))
    //same as above
    println(lst.filter(p=>p>2))
    println(maps.mapValues(_.equals("swapy")))
    println(maps.mapValues(_.toUpperCase()))
    //flatten method
    println(List(List(1,2,3,4,5,6),List(3,4,6,8,0,57)).flatten)//flaten the content of list
    println(lst.flatMap(x=>List(x,x+1)))
    println("Even List--->"+lst.filter(p=>p%2 ==0))
     println("Odd List--->"+lst.filter(p=>p%2 !=0))
  }
}