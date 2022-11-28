package chapter8

object fumction_takrRight {
  def main(raj:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to take the last N elements using the takeRight function")
    println(s"Take the last donut element in the sequence = ${donuts.takeRight(1)}")
    println(s"Take the last two donut elements in the sequence = ${donuts.takeRight(2)}")
    println(s"Take the last three donut elements in the sequence = ${donuts.takeRight(3)}")
  }
}
