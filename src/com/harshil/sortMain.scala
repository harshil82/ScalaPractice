package com.harshil

object sortMain {
  def main(args: Array[String]) {
    var ar = Array(1055,8,6,99,410,55,66,22,8,45,62,56)
    sort(ar);
    for(i <- 0 until ar.length)println(ar(i))
  }

  def sort(xs: Array[Int]) {
    def swap(i: Int, j: Int) {
      val temp = xs(i);
      xs(i) = xs(j);
      xs(j) = temp;
    }

    def sort1(l: Int, r: Int) {
      var pivot = xs((l + r) / 2);
      var i = l; var j = r;
      while (i <= j) {
        while (xs(i) < pivot) i += 1;
        while (xs(j) > pivot) j -= 1;
        if (i <= j) {
          swap(i, j);
          i += 1;
          j -= 1;
        }
      }
      if (l < j) sort1(l, j);
      if (j < r) sort1(i, r);
    }
    sort1(0, xs.length - 1)
  }

}