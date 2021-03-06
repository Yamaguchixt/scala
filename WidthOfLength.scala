package scalatest

import scala.io.Source
import java.io.File

object WidthOfLength {
  def main(args: Array[String]): Unit = {
    
    def widthOfLength(s: String) = s.length.toString.length

    if (args.length > 0 ) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft( (a,b) => if (a.length > b.length ) a else b )
      val maxWidth = widthOfLength(longestLine)
      for ( line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | "+ line)
        
      }
     }
    else
      Console.err.println("enter filename")
      
    val file = new File(".2") 
    println(file.getAbsolutePath());

    
  }
}