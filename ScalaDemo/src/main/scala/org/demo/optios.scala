package org.demo
//option give outcome as some or None
object optios {
  
  def  main(args : Array[String])
  {
    
    val lst =List(1,2,3,4,5,6,7)
    println(lst.find(_>6).get)
   val mapi = Map(1->"swapy",2->"sumbii")
   println(mapi.get(19).getOrElse("dhayan do be"))
   //Define options
   val opt :Option[Int] = Some(444444) //None
   println(opt.isEmpty)
   
  }
}