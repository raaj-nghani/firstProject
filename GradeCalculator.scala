package chapter2

object if_else extends App{
  println("Grade Calculator")
  println("Enter Marks : ")

  val marks : Int = scala.io.StdIn.readInt()
  if(marks <= 100 && marks >= 90) {
    println("A+ Grade")
  } else if(marks >= 80) {
    println("A Grade")
  } else if(marks >= 70) {
    println("B+ Grade")
  } else if(marks >=60) {
    println("B Grade")
  } else if(marks >=50) {
    println("C Grade")
  } else if(marks >=40) {
    println("D grade")
  } else if(marks >= 30) {
    println("E Grade")
  } else{
    println("Invalid Marks")
  }


}
