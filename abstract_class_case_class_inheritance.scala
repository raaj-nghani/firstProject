package chapter4

object abstract_class_case_class_inheritance extends App{
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String){
    def printName: Unit
  }

  println("\nStep 2: How to extend abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name: String) extends Donut(name){
    override def printName: Unit = println(name)
  }
  println("\nStep 3:How to extend abstract class Donut and define another case class called GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name){
    override def printName: Unit = println(name)
  }
  println("\nStep 4: How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

}
