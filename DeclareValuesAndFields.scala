package chapter4

object DeclareValuesAndFields extends App {
  println("Step 1: How to define a simple class to represent a Donut object")

  class Donut(name: String, productCode: Option[Long] = None) {

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")

  }

  println("\nStep 2: How to declare fields and values in companion object")

  object Donut {

    private val uuid = 1

    def apply(name: String, productCode: Option[Long]): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }

  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut", Some(1111))
  val vanillaDonut = Donut("Vanilla Donut")

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print
}
