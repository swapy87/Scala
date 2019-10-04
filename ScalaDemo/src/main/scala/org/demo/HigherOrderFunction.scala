package org.demo

object HigherOrderFunction {
  
  def math(a :Int, b : Int ,c:Int, f: (Int , Int) => Int ) : Int = f(f(a,b),c)
  
  def main(args :Array[String])
  {
    print(math(10,20,30,(_ max _)))
  }
}