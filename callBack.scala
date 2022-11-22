package chapter3

object callBack extends App{
println("\n Step 1: How to define a function with a callback parameter")
  def printReport(sendEmailCallBack:() => Unit): Unit ={
    println("Printing Report  ... started")
    println("Printing report  ... finished")
    sendEmailCallBack()
  }

  println("\nStep 2: How to call a function which has a callback parameter")
  printReport(() =>
    println("Sending email ... finished")
  )

  println("\nStep 3: How to call a function without providing its callback parameter")
  // printReport() // You get compile time error


  println("\nStep 4: How to define a function Function with an Option callback")

  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }

  println("\nStep 5: How to call a function without providing its callback parameter")
  printReportWithOptionCallback() // more elegant

  println("\nStep 6: How to call a function with Option callback parameter")
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))
}
