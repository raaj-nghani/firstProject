package chapter2

object variables extends App{
  val donutsToBuy: Int = 10
  println(donutsToBuy)

  val favouriteDonut: String = "Glazed Donut"
  println(favouriteDonut)
  //println(type(favouriteDonut))

  lazy val donutService = "initialize some donut service"

  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"



}
