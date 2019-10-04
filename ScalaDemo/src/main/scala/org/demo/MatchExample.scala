package org.demo

object MatchExample {
  
  def main (args : Array[String])
  {
    val rank=50
    //Match Statement
    rank match {
      case 1 => println("East or west swapnil is the best")
      case 2 |3|5|6|9 => println("koi bhi rak lo")
      case _=> println("ye wala default hai")
    }
    //Match as expresion
    println("Expresion")
    val result = rank match{
      case 1 => rank
      case 2 |3|5|6|9 => rank
      case _=> rank
    }
    
    print("result--->"+result)
  }
  var num=11
  val iseven=num%2
  println(s"even or not----->$iseven ")
  iseven match{
    case 0 =>println("ye even hai reeee");
    case _=>println("ye sab odd hai");
  }
}