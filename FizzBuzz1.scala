package jp.ac.hal

object FizzBuzz1 {
  def fizzBuzz(max: Int) = {
    require(max > 0)
    (1 to max)
      .map(
        (x:Int) =>
          (x % 3, x % 5) match {
            case (0,0) => x+" FizzBuzz"
            case (0,_) =>x+" FIZZ"
            case (_,0) => x+" BUZZ"
            case (_,_) => x
          })
      .foreach(println(_))
  }
  
  def main(a: Array[String]):Unit = { 
    for(i <- 1 to 50) println(  Set("Fizz"*(1-i % 3)+ "Buzz" *(1-i%5),i)-"" head    )}
  
    //fizzBuzz(30)

 
 

}