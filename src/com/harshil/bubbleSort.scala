package com.harshil


object bubbleSort {
  def main(args:Array[String]){
    var ar = Array(1055,8,6,99,410,55,66,22,8,45,62,56)
    sort(ar);
    for(i <- 0 until sort(ar).length)println(sort(ar)(i))
  }
  
  /***
 * Genius ,  right ??
 * Damm ! I have cheated on java.
 */
    def sort(xs:Array[Int]):Array[Int]={
    if(xs.length<=1) xs
    else{
      val pivot = xs(xs.length/2)
      Array.concat(sort(xs filter (pivot>)),
          xs filter(pivot ==),
          sort(xs filter (pivot <)))
    }
  }
  
}

