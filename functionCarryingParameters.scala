package chapter3

object functionCarryingParameters extends App{
println("Step 1: How to define function with curried parameter groups")
  def totalCost(donutType: String)(dquantity: Int)(discournt:Double):Double={
  println(s"calculating total cost for $dquantity $donutType with ${discournt* 100}% discount")
    val totalCost = 2.50 * dquantity
    totalCost -(totalCost * discournt)
  }
  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total Cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glaze Donut")_
  println("\nStep 4: How to call a function with curried parameter groups")
  println(s"Total Cost = ${totalCost("Glazed Donut")(10)(0.1)}")

}
