package chapter8

object function_max_min extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donuts sequence = ${donuts.max}")

  println("\nStep 3: How to initialize donut prices")
  val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)

  println("\nStep 4: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donut prices sequence = ${prices.max}")

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donuts sequence = ${donuts1.min}")

  println("\nStep 3: How to initialize donut prices")
  val prices1: Seq[Double] = Seq(1.50, 2.0, 2.50)

  println("\nStep 4: How to find the maximum element in the sequence using the max function")
  println(s"Max element in the donut prices sequence = ${prices1.min}")


}
