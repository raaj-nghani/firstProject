package chapter8

object function_transpose {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to initialize donut prices")
    val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
    println(s"Elements of prices = $prices")

    println("\nStep 3: How to create a List of donuts and prices")
    val donutList = List(donuts, prices)
    println(s"Sequence of donuts and prices = $donutList")

    println("\nStep 4: How to pair each element from both donuts and prices Sequences using the transpose function")
    println(s"Transposed list of donuts paired with their individual prices = ${donutList.transpose}")
  }
}
