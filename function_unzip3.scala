package chapter8

object function_unzip3 extends App{
  println("Step 1: How to initialize a Sequence of Tuple3 elements")
  val donuts: Seq[(String, Double, String)] = Seq(("Plain Donut", 1.5, "Tasty"), ("Glazed Donut", 2.0, "Very Tasty"), ("Strawberry Donut", 2.5, "Very Tasty"))
  println(s"Donuts tuple3 elements = $donuts")

  println("\nStep 2: How to call unzip3 function to unzip Tuple3 elements")
  val unzipped: (Seq[String], Seq[Double], Seq[String]) = donuts.unzip3
  println(s"Unzipped donut names = ${unzipped._1}")
  println(s"Unzipped donut price = ${unzipped._2}")
  println(s"Unzipped donut taste = ${unzipped._3}")
}
