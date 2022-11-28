package chapter8

object function_Filter_and_filterNot {
  def main(args:Array[String]):Unit={
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut", "Vanilla Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to keep only Plain and Glazed Donuts using the filter method")
    val sequenceWithPlainAndGlazedDonut = donuts.filter{donutName => donutName.contains("Plain") || donutName.contains("Glazed")}
    println(s"Sequence with Plain and Glazed donuts only = $sequenceWithPlainAndGlazedDonut")

    println("\nStep 3: How to filter out element Vanilla Donut using the filterNot function")
    val sequenceWithoutVanillaDonut = donuts.filterNot(donutName => donutName =="Vanilla Donut")
    println(s"Sequence without vanilla Donut = $sequenceWithoutVanillaDonut")
  }

}
