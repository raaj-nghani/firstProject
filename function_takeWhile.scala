package chapter8

object function_takeWhile {
  def main(raj:Array[String]):Unit={
    println("Step 1: How to initialize a List of donuts")
    val donuts: Seq[String] = List("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to take elements from the List using the takeWhile function")
    println(s"Take donut elements which start with letter P = ${donuts.takeWhile(_.charAt(0) == 'P')}")

    println("\nStep 3: How to declare a predicate function to be passed-through to the takeWhile function")
    val takeDonutPredicate: (String) => Boolean =(donutName) => donutName.charAt(0) == 'P'
    println(s"Value function takeDonutPredicate = $takeDonutPredicate")

    println("\nStep 4: How to take elements using the predicate function from Step 3")
    println(s"Take elements using function form Step 3 = ${donuts.takeWhile(takeDonutPredicate)}")

  }
}
