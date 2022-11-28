package chapter8

object function_per extends App{
  println("Step 1: How to initialize an Immutable Sequence of various donut flavours")
  val donutFlavours = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donutFlavours immutable sequence = $donutFlavours")

  println("\nStep 2: Convert the Immutable donut flavours Sequence into Parallel Collection")
  import scala.collection.parallel.ParSeq
  //val donutFlavoursParallel: ParSeq[String] = donutFlavours.par

  println("\nStep3: How to use scala parallel collection")
  //val donuts: ParSeq[String] = donutFlavours.map(x => s"$x donut")
  //println(s"Elements of donuts parallel collection = $donuts")

  println("Step 1: How to initialize a sequence which contains donut names and prices")
  val donutNamesAndPrices: Seq[Any] = Seq("Plain Donut", 1.5,10, "Strawberry Donut", 2.0, 15, "Glazed Donut", 2.5, 12)
  println(s"Elements of donutNamesAndPrices = $donutNamesAndPrices")

  println("\nStep 2: How to split the sequence by the element types using partition function")
  val nameAndPrices:(Seq[Any], Seq[Any]) = donutNamesAndPrices.partition{
    case name: String => true
    case price: Double => false
    case qty: Int => true
  }
  println(s"Elements of namesAndPrices = $nameAndPrices")

  println("\nStep 3: How to access the donut String sequence from Step 2")
  println(s"Donut names = ${nameAndPrices._1}")

  println("\nStep 4: How to access the donut String sequence from Step 2")
  println(s"Donut names = ${nameAndPrices._2}")

  println("\nStep 5: How to extract the pair returned by partition function")
  val (donutNames, donutPrices)= donutNamesAndPrices.partition{
    case name: String => true
    case _ => false
  }
  println(s"donutNames =$donutNames")
  println(s"donutPrices = $donutPrices")




}
