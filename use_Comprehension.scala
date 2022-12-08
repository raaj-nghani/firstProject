package chapter2

object comprehension extends App {
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  println("Enter number for table ")
  //val n = scala.io.StdIn.readInt()

  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for (numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for (numberOfDonuts <- 1 until 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\nStep 3: Filter values using if condition in for loop")
  val donutIngredients = List("flour","sugar","egg yolks","syrup","flavouring")
  for(indredients <- donutIngredients if indredients == "sugar") {
    println(s"found sweetening ingredient = $indredients")
  }

  println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  for{x <- 0 until 2
      y <- 0 until 2
      }println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")
  


}

OUTPUT

/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/402/lib/idea_rt.jar=32821:/snap/intellij-idea-community/402/bin -Dfile.encoding=UTF-8 -classpath /home/raj/IdeaProjects/allaboutscala/target/scala-2.13/classes:/home/raj/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar chapter2.comprehension
Step 1: A simple for loop from 1 to 5 inclusive
Enter number for table 
Step 1: A simple for loop from 1 to 5 inclusive
Number of donuts to buy = 1
Number of donuts to buy = 2
Number of donuts to buy = 3
Number of donuts to buy = 4
Number of donuts to buy = 5

Step 2: A simple for loop from 1 to 5, where 5 is NOT inclusive
Number of donuts to buy = 1
Number of donuts to buy = 2
Number of donuts to buy = 3
Number of donuts to buy = 4

Step 3: Filter values using if condition in for loop
found sweetening ingredient = sugar

Step 4: Filter values using if conditions in for loop and return the result back using the yield keyword
Sweetening ingredients = List(sugar, syrup)
Donut ingredient at index (0,0) = flour
Donut ingredient at index (0,1) = sugar
Donut ingredient at index (1,0) = egg
Donut ingredient at index (1,1) = syrup

Process finished with exit code 0

