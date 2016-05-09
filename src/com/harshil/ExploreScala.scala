package com.harshil

object ExploreScala {
  def main(args:Array[String]){
//    println(decorate(left = "<<<", str = "Hello", right = ">>>"))
    println(decorate("Hello", right = "]<<<"))
  }
  def decorate(str:String ,left:String="[",right:String="]") =
    left+right+str
}