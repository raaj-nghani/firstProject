package chapter8

object function_take {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to take elements from the sequence using the take function")
    println(s"Take the first donut element in the sequence = ${donuts.take(1)}")
    println(s"Take the first and second donut elements in the sequence = ${donuts.take(2)}")
    println(s"Take the first, second and third donut elements in the sequence = ${donuts.take(3)}")
  }
}
