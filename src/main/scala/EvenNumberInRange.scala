object EvenNumberInRange {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10){
      if (i % 2 == 0){
        println(s"$i is even")
      }
      else {
        println(s"$i is odd")
      }

    }
  }

}
