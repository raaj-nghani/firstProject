package chapter8

object function_reverseIterator {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to print all elements in reversed order using reverseIterator function")
    println(s"Elements of donuts in reversed order = ${donuts.reverseIterator.toList}")

    println("\nStep 3: How to iterate through elements using foreach method")
    val reverseIterator: Iterator[String] = donuts.reverseIterator
    reverseIterator.foreach(donut => println(s"donut = $donut"))

  }
}
