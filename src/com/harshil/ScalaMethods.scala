package com.harshil

import sun.org.mozilla.javascript.internal.ast.Yield

/**
 * At first, this scala object is similar as java singleton object
 * so this is singleton class.
 */
object ScalaMethods {

  def main(args: Array[String]) {
    println("Hello" intersect ("World")) // intersect is method in scala.collection
    println("Hello"(4)) // return 4th index of string
    println("Hello".contains('l'))
    println("ha" * 3) // wtf (multiple string with number) POOR JAVA
    println(10 max 2)

    import scala.util.Random
    println(println("Hello"))

    var x = 1;
    val cond = if (x > 1) 1 else 0 // This is similar to ternary operator in java/c++. 
    val anytype =  if(x<1) "Positive" else 1 ; // 
    println(cond) // :o  Everything in scala return something , This is how they handle nullpointer exception
    
    
    /**
     * Loop
     * -> Scala has no continue or break statement. 
     * Instead there are multiple option 
     */
     
     import scala.util.control.Breaks._
     breakable{
      for(i <- 1 to 10){
        print(i)
        if(i==7) {
          println("Last Statement")
          break;
        }
      }
    }
   println("Outside breakable loop")
   
   /**
    * Advanced Loop and expression
    */
   println("Advanced LOOP")
   for(i<- 1 to 3; j<- 2 to 5) print(i+j+" ")
    
   println()
   
   
   /** Generator with guard*/
   println("Generator with guard")
   for(i <- 1 to 3; j<-2 to 5 if(i==j))print("i= "+i+" j= "+j)
       
   
   println()
   /** Variable inside loop*/
   println("Variable inside loop")
   for( i <- 1 to 3; from = 4-i;j <- from  to 3)
       print("i= "+i+" j = "+j+" from = "+from +",")
   
   println()
   /** Yield keyword. This constructs Collection(Vector) for each element
    *  The loop is call for comprehension
    *  */
   println("Yield keyword")
   println( for(i <- 1 to 10) yield i % 3)
   println()
  /**Notes - > Generator is compatible with first generator which means type of yield return is depend on first expression type in for loop*/
   println(for(ch<-"HellTOWORLD";i<-1 to 1) yield (ch+i).toChar)
   println("Check this out")
   println(for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar)
      println()

  }
  
}