package currying_fun

object currying_fun{
  def add(a:Int)(b:Int) = {
    a+b
  }
  def main(args: Array[String]) = {
    var result = add(5)(8)
    println(result)
    var addIt = add(5)_
    //println(addIt)
    var result2 = addIt(3)
    println(result2)

  }

}


// def a(a:Int)(b:Int)(c:String)
// def b(a:Int,b:Int)

//fixing the first argument of the add function and addIt becomes
// a new function that takes the second argument.

// add(5)(8) fully applies the function, and we get the result of 5 + 8.
//add(5)_ partially applies the function, and we get a new function that takes one argument.
// This is useful for creating specialized functions with certain arguments already set.

//addIt(3) completes the application of the partially applied function, resulting in the calculation of 5 + 3.