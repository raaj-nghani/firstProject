package chapter8

object function_FIne extends App{

  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to find a particular element in the sequence using the find function")
  val plainDonut: Option[String] = donuts.find(x => x == "Plain Donut")
  println(s"find plain donut = ${plainDonut.get}")

  /*println("\nStep 3: How to find element Vanilla Donut which does not exist in the sequence using the find function")
  val vanillaDonut:String = donuts.find(_ == "Vanilla Donut").get
  println(s"Find Vanilla Donuts = $vanillaDonut")*/

  println("\nStep 4: How to find element Vanilla Donut using the find function and getOrElse")
  val vanillaDonut2:String = donuts.find(_== "Vanilla Donut").getOrElse("Vanilla Donut not found")
  println(s"Find Vanilla Donut = $vanillaDonut2")


}
