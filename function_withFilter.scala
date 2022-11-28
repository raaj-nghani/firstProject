package chapter8

object function_withFilter extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to filter elemets using the withFilter function")
  donuts.withFilter(_.charAt(0) == 'P').foreach(x => println(s"Donut starting with letter P =$x"))
}
