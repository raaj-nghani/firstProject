package chapter3

object useOption_inFunction extends App{
  println("Step 1: How to use Option and Some - a basic example")
  val glazedDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

  println("Step 1: How to define an Option in a function parameter")

  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

  println(s"\nTip 1: Use the map function to extract a valid Option value")
  val favoriteDonut: Option[String] = Some("Glazed Donut")
  favoriteDonut.map(d => println(s"Favorite donut = $d"))

  val leastFavoriteDonut: Option[String] = None
  leastFavoriteDonut.map(d => println(s"Least Favorite donut = $d"))





}
