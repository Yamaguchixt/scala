package jp.ac.hal
import scala.util.Random._
import scala.util.Random
import java.io._


object NumberInspection {
  def NumberInspection :Unit ={
    val rg = new Random
    val rn = rg.nextInt(100)
    val br:BufferedReader  = new BufferedReader(new InputStreamReader(System.in))
    var in = Integer.parseInt(br.readLine())
    
    while(rn != in ){
      if(rn > in) println("もっと大きい数です")
      else println("もっと小さい数です")
      in = Integer.parseInt(br.readLine())
    }
    println("当たりです！　正解の数＝"+rn)
  }
  

  
  def NumberInspection2 : Unit = {
    var list = List(1,2,3,4,5,6,7,8,9)
    
    list = scala.util.Random.shuffle(list)
    println(list)
    val n1 = list.head
    val n2 = list.tail.head
    val n3 = list.tail.tail.head
   // println(n1,n2,n3)
    val tn = n1*100 + n2*10 + n3
    
    var biteN = 0
    var eatN = 0
    
    val br:BufferedReader  = new BufferedReader(new InputStreamReader(System.in))
    var in = 0 

    
    while(tn != in){
     
      in = Integer.parseInt(br.readLine())
    
      var in1 = Integer.parseInt(in.toString.charAt(0).toString)
      var in2 = Integer.parseInt(in.toString.charAt(1).toString)
      var in3 = Integer.parseInt(in.toString.charAt(2).toString)
      
      
      if(n1 == in1) {eatN = eatN + 1 }
      if(n2 == in2) {eatN = eatN + 1 }
      if(n3 == in3) {eatN = eatN + 1 }
      
     if( in1 == n2 || in1 == n3) biteN = biteN + 1
     if( in2 == n1 || in2 == n3) biteN = biteN + 1
     if( in3 == n1 || in3 == n2 ) biteN = biteN + 1
      
     println(eatN+"eat-"+biteN+"bite")
      
     eatN = 0
     biteN = 0
      
      println("次の推測値を入力してください")
    }
    
    println("正解です　答え＝"+tn) 
      
  }


  
  def main(args:Array[String]):Unit = {
    NumberInspection2
  }
}