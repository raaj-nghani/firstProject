package chapter3

object functions_ extends App{
  def naam():String = {
  "Raj Kumar Bhardwaj"
  }
val name = naam()
  println(s"My name is $name")
  println("Step 1: How to define and use a function which has no parameters and has a return type")
  def favoriteDonut(): String = {
    "Glazed Donut"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is $myFavoriteDonut")

  println("\nStep 2: How to define and use a function with no parenthesis")

  def leastFavoriteDonut = "Plain Donut"

  println(s"My least favorite donut is $leastFavoriteDonut")

  println("\nStep 3: How to define and use a function with no return type")

  def printDonutSalesReport(): Unit = {
    // lookup sales data in database and create some report
    println("Printing donut sales report... done!")
  }

  printDonutSalesReport()

 def inTerestCalculator(): Int ={
   val principal = 1500
   val time = 2
   val rate = 3
   val interest = (principal*rate*time)/100
   return interest
 }
  println(s"Interest is : $inTerestCalculator Rs.")

  println("Step 1: How to define function with parameters")

  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    // make some calculations ...
    2.50 * quantity
  }
}
