package chapter8

object function_DropWhile {
  def main(args:Array[String]):Unit={

    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut 1", "Plain Donut 2", "Strawberry Donut", "Plain Donut 3", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to drop elements from the sequence using the dropWhile function")
    println(s"Drop donut elements whose name starts with letter P = ${donuts.dropWhile(_.charAt(0) == 'P')}")

    println("\nStep 3: How to declare a predicate function to be passed-through to the dropWhile function")
    val dropElementsPredicate: (String) => Boolean = (donutName) => donutName.charAt(0) == 'P'
    println(s"Value function dropElementsPredicate = $dropElementsPredicate")

    println("\nStep 4: How to drop elements using the predicate function from Step 3")
    println(s"Drop elements using function from Step 3 = ${donuts.dropWhile(dropElementsPredicate)}")

    val names: Seq[String] = Seq("Ramesh","Ram","Renu","Suresh","Kiran","Himesh","Raghav")
    println(names.dropWhile(_.charAt(0)=='R'))



  }

}
