package chapter8

object function_zipWithIndex extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut","Strawberry Donut","Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to zip the donuts sequecne with their corresponding index using zipWithIndex method")
  val zippedDonutsWithIndex: Seq[(String, Int)] = donuts.zipWithIndex
  zippedDonutsWithIndex.foreach{zippedDonutsWithIndex => println(s"Donut element = ${zippedDonutsWithIndex._1} is at index = $zippedDonutsWithIndex._2")}
}
