package chapter8

object function_reverse extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to get the elements of the sequence in reverse using the reverse method")
  println(s"Elements of donuts in reversed order = ${donuts.reverse}")

  println("\nStep 3: How to access each reversed element using reverse and foreach methods")
  donuts.reverse.foreach(donut => println(s"donut = $donut"))
}
