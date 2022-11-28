package chapter8

object function_zip extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts = Seq("Plain Donut","Strawberry Donut","Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to initialize a sequence of donut prices")
  val donutPrices: Seq[Double] = Seq(1.5, 2.0, 2.5)
  println(s"Elements of donutPrices = $donutPrices")

  println("\nStep 3: How to use zip method to zip two collections")
  val zippedDonutsAndPrices: Seq[(String, Double)] = donuts zip donutPrices
  println(s"Zipped donuts and prices = $zippedDonutsAndPrices")

  println("\nStep 4: How to use unzip method to un-merge a zipped collections")
  val unzipped = zippedDonutsAndPrices.unzip
  println(s"Donut names unzipped = ${unzipped._1}")
  println(s"Donut prices unzipped = ${unzipped._2}")

}
