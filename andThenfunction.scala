package chapter3

object andThenfunction extends App{
println("Step 1: Assume a fre-calculated total cost amount")
  val totalCost: Double =10

  println("\nStep 2: How to define a val function to apply discount on total cost")
  val applyDoscountValFunction = (amount: Double) => {
    println("Apple discount function")
    val discount = 2
    amount - discount
  }
  println("\nSetp 3: How to call a val function")
  println(s"Total cost of 5 Donuts with discount = ${applyDoscountValFunction(totalCost)}")
  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValFunction = (amount : Double) => {
    println("Apply Tax Function")
    val tax = 1
    amount + tax
  }
  println("\nStep 5: How to call andThen on  a val function")
  println(s"Total Cost of 5 Donuts = ${(applyDoscountValFunction andThen applyTaxValFunction)(totalCost)}")


}
