package chapter4

object Extend_Class_Class_Inheritance extends App{

  println("Step 1: How to define an abstract class called Donut")

  abstract class Donut(name: String) {

    def printName: Unit

  }

  println("\nStep 2: How to extend abstract class Donut and define a sub-class of Donut called VanillaDonut")

  class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object VanillaDonut {

    def apply(name: String): Donut = {
      new VanillaDonut(name)
    }

  }

  println("\nStep 3: How to extend abstract class Donut and define another sub-class of Donut called GlazedDonut")

  class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  object GlazedDonut {

    def apply(name: String): Donut = {
      new GlazedDonut(name)
    }

  }

  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName


}
