package chapter8

object function_unzip extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to initialize a Sequence of donut prices")
  val donutPrices = Seq[Double](1.5, 2.0, 2.5)
  println(s"Elements of donut prices = $donutPrices")

  println("\nStep 3: How to zip the donuts Sequence with their corresponding prices")
  val zippedDonutsAndPrices: Seq[(String, Double)] = donuts zip donutPrices
  println(s"Zipped donuts and prices = $zippedDonutsAndPrices")

  println("\nStep 4: How to unzip the zipped donut sequence into separate donuts names and prices Sequences")
  val unzipped: (Seq[String], Seq[Double]) = zippedDonutsAndPrices.unzip
  println(s"Donut names unzipped = ${unzipped._1}")
  println(s"Donut prices unzipped = ${unzipped._2}")


}
