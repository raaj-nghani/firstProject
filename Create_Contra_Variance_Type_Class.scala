package chapter4

object Create_Contra_Variance_Type_Class extends App{
  println("Step 1: How to define an abstract class called Donut")
  abstract class Donut(name: String){
    def printName: Unit
  }
  println("\nStpe 2: How to extends abstract class Donut and define a case class called VanillaDonut")
  case class VanillaDonut(name:String) extends Donut(name){
    override  def printName: Unit = println(name)
  }

  println("\nStep 3: How to extend abstract class Donut and define another case class GlazedDonut")
  case class GlazedDonut(name: String) extends Donut(name){
    override def printName: Unit = println(name)
  }
  println("\nStep 4: Hoe to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  println("\nStep 5: How to define a ShoppingCart type class which expects Donut type")
  class ShoppingCart[D <: Donut] (donuts: Seq[D]){
    def printCartItems: Unit = donuts.foreach(_.printName)
  }
  println("\nStep 6: How to create instances or objects of SHoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems

  println(s"\nStep 7: How to enable contra-variance on ShoppingCart")
  class ShoppingCart2[-D <: Donut](donuts: Seq[D]){
    def printCartItems: Unit = donuts.foreach(_.printName)
  }


}
