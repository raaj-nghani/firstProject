package chapter8

object function_size {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")/*
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to count the number of elements in the sequence using size function")
    println(s"Size of donuts sequence = ${donuts.size}")

    println("\nStep 3: How to use the count function")
    println(s"Number of times element Plain Donut appear in donuts sequence = ${donuts.count(_ == "Plain Donut")}")

    println("\nStep 2: How to take a section from the sequence using the slice function")
    println(s"Take elements from the sequence from index 0 to 1 = ${donuts.slice(0, 1)}")
    println(s"Take elements from the sequence from index 0 to 2 = ${donuts.slice(0, 2)}")
    println(s"Take elements from the sequence from index 0 to 3 = ${donuts.slice(0, 3)}")

    println("\nStep 3: Slice function where the index is out of range")
    println(s"Take elements from the sequence from index 0 to 4 = ${donuts.slice(0, 4)}")

    println("\nStep 1: How to create a case class to represent Donut objects")
    case class Donut(name: String, price: Double)

    println("\nStep 2: How to create a Sequence of type Donut")
    val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
    println(s"Elements of donuts = $donuts")

    println("\nStep 3: How to sort a sequence of case class objects using the sortBy function")
    println(s"Sort a sequence of case class objects of type Donut, sorted by price = ${donuts.sortBy(donut => donut.price)}")*/

    println("Step 1: How to initialize donut prices")
    val prices: Seq[Double] = Seq(1.50, 2.0, 2.50)
    println(s"Elements of prices = $prices")

    println("\nStep 2: How to sort a sequence of type Double using the sorted function")
    println(s"Sort a sequence of type Double by their natural ordering = ${prices.sorted}")

    println("\nStep 3: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 4: How to sort a sequence of type String using the sorted function")
    println(s"Sort a sequence of type String by their natural ordering = ${donuts.sorted}")


  }
}
