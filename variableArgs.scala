/*
package chapter3

object variableArgs extends App{
  def printReport(names: String*) {
    println(s"""Donut Report = ${names.mkString(" - ")}""")
  }

  println("\nStep 2: How to call function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut","Pasta","Chapati")

  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts:_*)

  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  printReport(seqDonuts:_*)

  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  printReport(arrDonuts:_*)

  class DonutCostCalculator {

    // We are hard-coding the totalCost value for simplicity.
    val totalCost = 100
  }

    println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()
  println("\nStep 2: How to call a function from an instantiated class")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")
}
*/
