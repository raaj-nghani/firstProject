package chapter3

object higherOrderFunction extends App{
println("Step 1: review how to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount: Double):Double ={
    println(s"calculating total cost for $quantity $discount with ${discount * 10}% discount")
    val totalCost=2.50 * quantity
    totalCost -(totalCost*discount)
  }
  println("\n Step 2: How to define a higher order function which takes another function")
  def totalCostWithDiscoybtFunctionParameter(donutType:String)(quantity: Int)(f: Double => Double):Double ={
    println(s"Calculating Total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  println("\n Step 3: How to call Higher Order Function and pass anonymous function as parameter")
  val totalCostof5Donuts = totalCostWithDiscoybtFunctionParameter("Glaze Donut")(5){totalCost=>
    val discount = 2
    totalCost - discount
  }
  println(s"Total Cost for 5 Glaze Donuts with anonymous discount function = $totalCostof5Donuts")
  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double ={
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscoybtFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")
}
