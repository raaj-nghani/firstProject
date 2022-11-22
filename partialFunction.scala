package chapter3

object partialFunction extends App{
println("step1: Review of Pattern matching in scala")
  val donut = "Glazed Donut"
  val tasteLevel = donut match {
    case "Glazed Donut" | "Strawberry Donut" => "very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donut = $tasteLevel")

  println("\nStep 2: How to define a Partial Function named isVertTasty")
  val isVaryTasty : PartialFunction[String, String]={
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }
  println("\nStep 3: How to call the Partial Function named is VeryTasty")
  println(s"Calling partial function isVeryTasty = ${isVaryTasty("Glazed Donut")}")

  println("\nStep 4; How to define partialFunction named isTasty and unkownTaste")
  val isTasty: PartialFunction[String, String]={
    case "Plain Donut" => "Tasty"
  }
  val unknownTaste: PartialFunction[String,String]={
    case donut @ _ => s"Unknown taste for donut = $donut"
  }

  println("Step 5: How to compose Partial Function using orElse")
  val donutTaste = isVaryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))
}
