package chapter2

object Scala_String_Interpolation extends App{
  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  println("\nStep 2: Using String interpolation on object properties")

  case class Donut(name: String, tasteLevel: String)

  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")

  println("\nStep 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")


  println("\nStep 5: Using f interpolation to format numbers")
    println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")

  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")



}

OUTPUT
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/402/lib/idea_rt.jar=38475:/snap/intellij-idea-community/402/bin -Dfile.encoding=UTF-8 -classpath /home/raj/IdeaProjects/allaboutscala/target/scala-2.13/classes:/home/raj/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar chapter2.Scala_String_Interpolation
Step 1: Using String interpolation to print a variable
My favorite donut = Glazed Donut

Step 2: Using String interpolation on object properties
My favorite donut name = Glazed Donut, tasteLevel = Very Tasty

Step 3: Using String interpolation to evaluate expressions
Are we buying 10 donuts = true

Step 4: Using String interpolation for formatting text
       Vanilla Donut Tasty

Step 5: Using f interpolation to format numbers

Step 5: Using f interpolation to format numbers
Donut price = 2.5
Formatted donut price = 2.50

Step 6: Using raw interpolation
Favorite donut\tVanilla Donut

Process finished with exit code 0

