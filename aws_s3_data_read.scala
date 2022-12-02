package sparkpack
	import org.apache.spark._
	import org.apache.spark.sql._
	import sys.process._
object sparkobj{
	def main(args:Array[string]):Unit={
	val conf = new SparkConf().setAppName(“AWS Integration”).setMaster(“local[*]”)
	val sc = new SparkContext(conf)
val spark = SparkSession.builder().appName(“first”)
	.config(“fs.s3a.accesskey”,”		“)
	.config(“fs.s3a.secretkey”,”		“)
	.getOrCreate()
val data = spark.read.format(“csv”).option(“header”,”true”).load(“s3://zeyo30b/data/txns10k.txt”)
data.show()
}
}
