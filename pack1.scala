package chapter4

object pack1 extends App{
class Donut(name:String, price:Long){
  def print = println(s"Donut name is $name and Price is $price")
}
/*
  def venilla = new Donut("Venilla", 1200)
  def glazed = new Donut("Glazed Donut", 1500)
  venilla.print
  glazed.print
*/
println("\n Step 2: How to declare a companion object for the Donut Class")
  object Donut{
    def apply(name:String, productCode:Long):Donut={
      new Donut(name, productCode)
    }
  }
  println("\n Step 3: How to create instances of the Donut class using companion")
  val glazedDonut = Donut("Glazed Donut", 1111)
  val vanillaDonut = Donut("Vanilla Donut", 2222)

  println("\n Step 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print

}
