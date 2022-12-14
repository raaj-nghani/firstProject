package chapter8

object functionDiff {
def main(args:Array[String]):Unit={
  println("Step 1: How to initialize a Set containing 3 donuts")
  val donutBasket1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donutBasket1 = $donutBasket1")

  println("\nStep 2: How to initialize a Set containing 2 donuts")
  val donutBasket2: Set[String] = Set("Glazed Donut", "Vanilla Donut")
  println(s"Elements of donutBasket2 = $donutBasket2")

  println("\nStep 3: How to find the difference between two Sets using the diff function")
  val diffDonutBasket1from2: Set[String] = donutBasket1 diff(donutBasket2)
  println(s"Elements of diffDonutBasket1from2 = $diffDonutBasket1from2")

  println("\nStep 4: How to find the difference between two Sets using the diff function")
  val diffDonutBasket2From1: Set[String] = donutBasket2 diff donutBasket1
  println(s"Elements of diff DonutBasket2From1 = $diffDonutBasket2From1")

  println("\nStep 5: How to find the difference between two Sets using the --")
  println(s"Difference between donutBasket1 and donutBasket2 = ${donutBasket1 -- donutBasket2}")
  println(s"Difference between donutBasket2 and donutBasket1 = ${donutBasket2 -- donutBasket1}")



}
}
