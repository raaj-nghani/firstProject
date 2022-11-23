package chapter4

object Classes_Object extends App{
class Donut(name:String, productCode: Long){
  def print = println(s"Donut name = $name, productCode = $productCode")
}
  println("\nStep 2: How to create instances of Donut Class")
  val glazedDonut = new Donut("Glazed Donut", 1111)
  val vanillaDonut = new Donut("Vanill Donut", 2222)

  println("\nStep 3: How to call the print function for teach of the donut object")
  glazedDonut.print
  vanillaDonut.print

  println("\nStep 4: How to access the properties of class Donut")
  /*glazedDonut.name
  glazedDonut.productCode*/
}
