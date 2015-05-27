package jp.ac.hal

object fibonacci {
  def fibonacciNumber = {
    
    var a = 1L
    var b = 1L
    var c = a + b
    
    for(i <- 1 to 20){
      println(c)
      a = b
      b = c
      c = a + b
    }
  }
  
  def main(args: Array[String]) : Unit = {
    fibonacciNumber
  }

}