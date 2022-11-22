package chapter3

import sun.util.calendar.BaseCalendar.Date

object usingCompose extends App {
  //val soap: Array[String] = Array("Lifboy","Lux","Godrej","Vim","Rin")
  var item = 3
  var disc = 6

  val totalCost : Double = 10
  val applyDiscount = (amount:Double) => {
    var discount = disc
    disc = item
    amount - discount
  }
  println(s"\nTotal cost of $item soaps with discount = ${applyDiscount(totalCost)}")
  /*println("Step 1: Assume a pre-calculated total cost amount")
  val totalCost : Double = 10

  println("\bStep 2: How to define a val function to apply discount to total cost")
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount Function")
    val discount = 2
    amount - discount
  }

  println("Step 3: How to call a val function")
  println(s"\nTotal cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValCunction = (amount : Double) =>{
    println("Apply Tax Function")
    val tax = 1
    amount + tax
  }

  println("\nStep 5: How to call compose on a val function")
  println(s"Total cost of 5 donuts = ${(applyDiscountValFunction compose applyTaxValCunction)(totalCost)}")
*/


}
