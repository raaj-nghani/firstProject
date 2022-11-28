package chapter8

object function_foreach extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
  println(s"Elements of donuts = $donuts")

  println("\nStep 2: How to loop through all the elements in the sequence using the foreach function")
  donuts.foreach(println(_))

  println("\nStep 3: How to loop through and access all the elements in the sequence using the foreach function")
  donuts.foreach(x => println(s"x = $x"))

  println("\nStep 4: How to declare a value function to format a donut names into upper case format")
  val uppercase: (String) => String = (s) => {
    val upper = s.toUpperCase
    println(upper)
    upper
  }
  println(s"Value function formatting donut names to uppercase = $uppercase")

  println("\nStep 5: How to format all donuts to uppercase using value function from Step 4")
  donuts.foreach(uppercase)


}
