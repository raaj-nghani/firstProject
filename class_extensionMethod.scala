package chapter4

object class_extensionMethod extends App{
  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long]=None)

  println("\nStep 2: How to create instances or objects for teh Donut case class")
  val vanillDonut: Donut = Donut("Vanilla",1.50)
  println(s"Vanilla donut name = ${vanillDonut.name}")
  println(s"Vanilla donut price = ${vanillDonut.price}")
  println(s"Vanilla donut product Code = ${vanillDonut.productCode}")

  println("\nStep 3: How to define an implicit class to augment or extend the Donut case class")
  object DonutImplicits{
    implicit class AugmentedDonut(donut: Donut){
      def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }
  }

  println("\nStep 4: How to import and use the implicit class AugmentedDonut from step 3")
  import DonutImplicits._
  println(s"Vanilla donut uuid = ${vanillDonut.uuid}")

}
