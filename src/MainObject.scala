//An attempt at Scala
/*
Scala is Java based, but there are some differences.
Here's an attempt at familiarizing myself with the syntax
Scala is both functional and object oriented
Everything is an object in Scala
Scala will run on the JVM (but compiles slower)
You can run Scala in a REPL
Scala can also infer types for variables you return
*/

object MainObject {
  
  def main(args: Array[String]) {
      var firstVar: String = "A variable (mutable) declared with the var keyword";
      var firstVal: String = "A value (immutable) declared with the val keyword";
      println("Hello, world!")
      //Semicolons are optional, only needed for multiple instructions on same line
      //Or in situations too complex for the compiler to handle
      println(firstVar)
      println(firstVal)
      println(min(21,42))
      println(max(21,42))
      println(equalInt(10,10))
      println(equalInt(5,3))
      //Rather than using for each syntax of loop in java (explicitly declaring for loop) we can:
      (0 to 10).foreach(print(_))
      println()
      
   }
  
  //This is how you declare a function
  //Scala can't infer argument types
  def min(x: Int, y:Int): Int = {
    if(x < y){
      return x
    }
    else{
      return y
    }
  }
  //We can also drop the return keyword. The last line executed is implicitly returned
  def max(x: Int, y:Int): Int = {
    if(x > y){
      x
    }
    else{
      y
    }
  }
  
  //Can even do it in one line (kinda ternary-ish)
  //Just don't forget the = sign after return type
  def equalInt(x: Int, y:Int): Boolean = if(x == y) true else false
  
  //WE HAVE OPERATOR OVERLOADING :D
  //List in Scala != list in Java. They have different types. Qualify the names
  //The Root of the Scala class hierarchy is the Any class (think of like Java Object)
  //  While also remembering that EVERYTHING in Scala is an object. Thus, this is the root of everything
  //  Two children classes, anyval and anyref
  //    Anyval is "primitive" types that wrap Java prim types and Unit type
  //    Anyref is an alias for java.lang.object
  //      NULL extends all references types
  //      Nothing extends all reference and value types, including null
  //Special case: Unit is essentially the same as void
}