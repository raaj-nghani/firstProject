package chapter2

object Escape_Charaters_multiline_print extends App{
  println("Step 1: Immutable variable")
  val donutsToBuy: Int = 5

  val donutsBought = 5

  println("\nStep 2: Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()

  println("\nStep 3: Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  println("\nStep 4: User driven conversion from one data type to another ")
  // NB: You cannot convert from an Int to a String
  // val minimumDonutsToSell: String = numberOfDonuts

  val minimumDonutsToSell: String = numberOfDonuts.toString()
}

OUTPUT

/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/402/lib/idea_rt.jar=41857:/snap/intellij-idea-community/402/bin -Dfile.encoding=UTF-8 -classpath /home/raj/IdeaProjects/allaboutscala/target/scala-2.13/classes:/home/raj/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar chapter2.Escape_Charaters_multiline_print
Step 1: Immutable variable

Step 2: Scala Types

Step 3: Using Scala compiler to convert from one data type to another

Step 4: User driven conversion from one data type to another 

Process finished with exit code 0
