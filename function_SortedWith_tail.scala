package chapter8

object function_SortedWith_tail {
  def main(args:Array[String]):Unit={
    println("\nStep 1: How to create a case class to represent Donut objects")
    case class Donut(name: String, price: Double)

    println("\nStep 2: How to create a Sequence of type Donut")
    val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
    println(s"Elements of donuts = $donuts")

    /*println("\nStep 3: How to sort a sequence of case class objects using the sortWith function")
    println(s"Sort a sequence of case classes of type Donut, sorted with price = ${donuts.sortWith(_.price < _.price)}")

    println("\nStep 4: How to sort a sequence of case class objects in ascending order using the sortWith function")
    println(s"Sort a sequence of case classes of type Donut, sorted with price in ascending order = ${donuts.sortWith(_.price < _.price)}")
    println(s"Sort a sequence of case classes of type Donut, sorted with price in ascending order explicitly = ${donuts.sortWith((d1, d2) => d1.price < d2.price)}")

    println("\nStep 5: How to sort a sequence of case class objects in descending order using the sortWith function")
    println(s"Sort a sequence of case classes of type Donut, sorted with price in descending order = ${donuts.sortWith(_.price > _.price)}")
    println(s"Sort a sequence of case classes of type Donut, sorted with price in descending order explicitly = ${donuts.sortWith((d1, d2) => d1.price > d2.price)}")

    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to return all elements in the sequence except the head using the tail function")
    println(s"Elements of donuts excluding the head = ${donuts.tail}")

    println("\nStep 3: How to access the last element of the donut sequence by using the last function")
    println(s"Last element of donut sequence = ${donuts.last}")

    println("\nStep 4: How to access the first element of the donut sequence by using the head function")
    println(s"First element of donut sequence = ${donuts.head}")*/


  }
}
