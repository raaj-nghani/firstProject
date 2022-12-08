package chapter2

object if_else extends App{
  println("Step 1: Using if clause as a statement")
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultDonutsToBuy = 8

  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")

  println("\nStep 3: Using if, else if, and else clause as a statement")
  if (numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  println("\nStep 4: Using if and else clause as expression")
  val numberOfDonutsToBuy = if (numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")


}
OUTPUT

/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/402/lib/idea_rt.jar=40237:/snap/intellij-idea-community/402/bin -Dfile.encoding=UTF-8 -classpath /home/raj/IdeaProjects/allaboutscala/target/scala-2.13/classes:/home/raj/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.10/scala-library-2.13.10.jar chapter2.if_else
Step 1: Using if clause as a statement
Number of donuts to buy = 40

Step 2: Using if and else clause as a statement
Number of donuts to buy = 40

Step 3: Using if, else if, and else clause as a statement
Number of donuts to buy = 40

Step 4: Using if and else clause as expression
Number of donuts to buy = 40

Process finished with exit code 0
