package org.demo

object Reduce_Fold_Scan {
  
  
  def main(args :Array[String])
  {
    val lst= List(1,2,3,4,5,6,7,8,9)
    val lsta=List("a","b","c","d","e")
    println("Reduce Left")
    println(lst.reduce(_+_))//add all the value to one
    println(lst.reduceLeft((a,b)=>{ //adding and pass add value of element to left 
      println(a + "  " + b)
      a+b
    }))
    //Reduce to right
     println(lst.reduceRight((a,b)=>{ //adding and pass add value of element to left 
      println(a + "  " + b)
      a+b
    }))
    //Fold left or right
    println(lst.foldRight(100)(_+_)) //first parameter will be first parameter for list
    //Scan List
    println("Scannnnnnnnnnnnnn")
    println(lst.scan(100)(_+_))
     println(lst.scanLeft(100)(_+_))
     println(lst.scanRight(100)(_+_))// return scanned list and add first value in list
    //last value will be final outcome
    }
}