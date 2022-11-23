package chapter4

object DefineCaseClass extends App{
  println("\nStep 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, Price: Double, ProductCode: Option[Long] = None)

  println("\nStep 2: How to create instances or objects for teh Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50)
  val glazedDonut: Donut = Donut("Glazed Donut", 2.0)
  println(s"Vanilla Donut = $vanillaDonut")
  println(s"Glazed Donut = $glazedDonut")

  println("\n Step 3: How to access fields of the Donut object")
  println(s"Vanilla Donut name field = ${vanillaDonut.name}")
  println(s"Vanilla Donut price field = ${vanillaDonut.Price}")
  println(s"Vanilla Donut productCode field = ${vanillaDonut.ProductCode}")

  println("\nStep 5: How to define the hashcode and equals method for Donut object")
  val shoppingCart:Map[Donut, Int] = Map(vanillaDonut -> 4, glazedDonut -> 3)
  println(s"All items in shopping cart = ${shoppingCart}")
  println(s"Quantity of vanilla donuts in shopping cart = ${shoppingCart(vanillaDonut)}")
  println(s"Quantity of glazed donuts in shopping cart = ${shoppingCart(glazedDonut)}")

  println("\nTIP: How to create a new object of Donut by using the copy() method of the case class")
  val chocolateVanillaDonut: Donut = vanillaDonut.copy(name = "Chocolate And Vanilla Donut", Price = 5.0)
  println(s"Chocolate And Vanilla Donut = $chocolateVanillaDonut")
}
