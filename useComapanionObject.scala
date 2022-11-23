package chapter4

object useComapanionObject extends App {
  println("\n Step 1: How to define a sinple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){
    def print = println(s"Donut Name = $name, productCode = ${productCode.getOrElse(0)}")
  }

  println("\n Step 2: HOw to declare class hierarchy though inheritance using extends keyword")
  class GlazedDonut(name: String) extends Donut(name)
  class VanillaDonut(name:String) extends Donut(name)

  println("\n Step 3: How to declare apply method of companion object as a factory")
  object Donut{
    def apply(name:String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

    println("\nStep 4: How to call apply method of companion object which is a factory")
    val glazedDonut = Donut("Glazed Donut")
    println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
    glazedDonut.print

    val vanillaDonut = Donut("Vanilla Donut")
    println(s"The Class type of vanillaDonut = ${vanillaDonut.getClass}")
    vanillaDonut.print
  }

}
