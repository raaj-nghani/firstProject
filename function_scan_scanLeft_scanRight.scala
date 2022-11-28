package chapter8

object function_scan_scanLeft_scanRight {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a sequence of numbers")
    val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)
    println(s"Elements of numbers = $numbers")

    println("\nStep 2: How to create a running total using the scan function")
    val runningTotal1: Seq[Int] = numbers.scan(0)(_ + _)
    println(s"Running total of all elements in the collection = $runningTotal1")

    println("\nStep 3: How to create a running total using the scan function explicitly")
    val runningTotal2: Seq[Int] = numbers.scan(0)((a, b) => a + b)
    println(s"Running total of all elements in the collection = $runningTotal2")

    println("\nStep 2: How to create a running total using the scanLeft function")
    val runningTotal: Seq[Int] = numbers.scanLeft(0)(_ + _)
    println(s"Running total of all elements in the collection = $runningTotal")

    println("\nStep 3: How to create a running total using the scanLeft function explicitly")
    val runningTotal3: Seq[Int] = numbers.scanLeft(0)((a, b) => a + b)
    println(s"Running total of all elements in the collection = $runningTotal3")

    println("\nStep 2: How to create a running total using the scanRight function")
    val runningTotal4: Seq[Int] = numbers.scanRight(0)(_ + _)
    println(s"Running total of all elements in the collection = $runningTotal4")

    println("\nStep 3: How to create a running total using the scanRight function explicitly")
    val runningTotal5: Seq[Int] = numbers.scanRight(0)((a, b) => a + b)
    println(s"Running total of all elements in the collection = $runningTotal5")

  }
}
