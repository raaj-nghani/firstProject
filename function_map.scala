package chapter8

object function_map extends App{
  println("Step 1: How to initialize a Sequence of donuts")
  val donuts1: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
  println(s"Elements of donuts1 = $donuts1")

  println("\nStep 2: How to append the word Donut to each element using the map function")
  val donuts2: Seq[String] = donuts1.map(_ + " Donut")
  println(s"Elements of donuts2 = $donuts2")

  println("\nStep 3: How to create a donut sequence with one None element")
  val donuts3: Seq[AnyRef] = Seq("Plain", "Strawberry", None)
  donuts3.foreach(println(_))

  println("\nStep 4: How to filter out the None element using map function")
  val donuts4: Seq[String] = donuts3.map{
    case donut: String => donut + " Donut"
    case none => "Unknown Donut"
  }
  println(s"Elements of donut4 = $donuts4")

  println("\nStep 5: How to define couple of functions which returns an Option of type String")
  def favouriteDonut: Option[String] = Some("Glazed Donut")
  def leastFavouriteDonut: Option[String] = None

  println(s"Step 6: How to use map function to filter out None values")
  favouriteDonut.map(donut => println(s"Favourite Donut = $donut"))
  leastFavouriteDonut.map(donut => println(s"Least favouite donut = $donut"))




}
