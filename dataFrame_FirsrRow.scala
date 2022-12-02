package pack

object dataframe_firstRow extends App with Context{

  val donuts = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))
  val df = sparkSession
    .createDataFrame(donuts)
    .toDF("Donut Name", "Price")

  val firstRow = df.first()
  println(s"First row = $firstRow")

  val firstRowColumn1 = df.first().get(0)
  println(s"First row column 1 = $firstRowColumn1")

  val firstRowColumnPrice = df.first().getAs[Double]("Price")
  println(s"First row column Price = $firstRowColumnPrice")

  val donuts = Seq(("plain donut", 1.50, "2018-04-17"), ("vanilla donut", 2.0, "2018-04-01"), ("glazed donut", 2.50, "2018-04-02"))
  val df1 = sparkSession.createDataFrame(donuts).toDF("Donut Name", "Price", "Purchase Date")

  import org.apache.spark.sql.functions._
  //import spark.sqlContext.implicits._

  df1
    .withColumn("Price Formatted", format_number($"Price", 2))
    .withColumn("Name Formatted", format_string("awesome %s", $"Donut Name"))
    .withColumn("Name Uppercase", upper($"Donut Name"))
    .withColumn("Name Lowercase", lower($"Donut Name"))
    .withColumn("Date Formatted", date_format($"Purchase Date", "yyyyMMdd"))
    .withColumn("Day", dayofmonth($"Purchase Date"))
    .withColumn("Month", month($"Purchase Date"))
    .withColumn("Year", year($"Purchase Date"))
    .show()



}
