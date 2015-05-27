package jp.ac.hal

object ListPractice {
  def practice(max:Int): (Int,Int,Int,Int) = {
    val rang = (1 to max)
    (rang.max, rang.min, rang.sum, rang.sum/rang.size)
  }
  
  def myPractice(rangMax: Int): (Int,Int,Int,Double) = {
    var max:Int = 0;
    var min: Int = 1;
    var sum: Int = 0;
    var average: Double = 0.0
    val rang = (1 to rangMax)
    
        for(i <- rang)
          if(i > max) max = i
        for(i <- rang)
          if(i < min)min = i
        for(i <- rang)
          sum = sum + i
         average = sum/max
         
        (max,min,sum,average)
  }
  def main(a: Array[String]): Unit = {
     println(myPractice(10))
  }
}