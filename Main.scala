package jp.ac.hal
import  java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import scalatest.Rational;

object Main {
  def main(args: Array[String]){
    
  
    
    println("test");
    val br:BufferedReader = new BufferedReader(new InputStreamReader(System.in));
    var line: String = br.readLine();
    val number : Int = Integer.parseInt(line)
    val time = number % 24
    
   if(time <= 5) println("0~5")
   else if(time <= 10) println("6~10")
   else if(time <= 23) println("all")
    
    
    
  }
    
  
    def max(a: Int, b: Int):Int = {
      if(a > b) a
      else b
    }
     def min(a: Int, b: Int):Int = {
        if(max(a,b) == a) b
        else a
     }
   
   
    println("二つの数字を入力してください ex: 3 4")
    val br: BufferedReader = new BufferedReader(new InputStreamReader(System.in))
    val stringArray = br.readLine().split("[ ,]+")
    
    val number1: Int = Integer.parseInt(stringArray(0))
    val number2: Int = Integer.parseInt(stringArray(1))
   
    val answer: Int = max(number1,number2) - min(number1,number2);
    println("答えは :"+answer+"です") 
  
    
    def printDecriment(number :Int):Unit = {
      
      if(number == 1) println(1)
      else {printDecriment(number - 1)
      println(number)
      }
      
    
    println("decriment argue need")
    printDecriment(Integer.parseInt(br.readLine))
      
  }
    
}    
