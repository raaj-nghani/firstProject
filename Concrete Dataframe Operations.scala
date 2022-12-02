package pack

object Concatenate_DataFrames extends App with Context{
  val donuts = Seq(("111", "plain donut", 1.50), ("222", "vanilla donut", 2.0), ("333", "glazed donut", 2.50))

  val dfDonuts = sparkSession
    .createDataFrame(donuts)
    .toDF("Id", "Donut Name", "Price")
  dfDonuts.show()

  val inventory = Seq(("111", 10), ("222", 20), ("333", 30))
  val dfInventory = sparkSession
    .createDataFrame(inventory)
    .toDF("Id", "Inventory")
  dfInventory.show()

  val dfDonutsInventory = dfDonuts.join(dfInventory, Seq("Id"), "inner")
  dfDonutsInventory.show()
/*
  import sparkSession.sqlContext.implicits._

  val tagsDF = sparkSession
    .read
    .option("multiLine", true)
    .option("inferSchema", true)
    .json("src/main/resources/tags_sample.json")

  val df = tagsDF
    .select(explode($"stackoverflow") as "stackoverflow_tags")
    .select(
      $"stackoverflow_tags.tag.id" as "id",
      $"stackoverflow_tags.tag.author" as "author",
      $"stackoverflow_tags.tag.name" as "tag_name",
      $"stackoverflow_tags.tag.frameworks.id" as "frameworks_id",
      $"stackoverflow_tags.tag.frameworks.name" as "frameworks_name"
    )
  df.show()

  df
    .select("*")
    .where(array_contains($"frameworks_name", "Play Framework"))
    .show()*/

  val donuts1 = Seq(("plain donut", 1.50), ("vanilla donut", 2.0), ("glazed donut", 2.50))
  val df = sparkSession.createDataFrame(donuts1).toDF("Donut Name", "Price")

  df.show()

  val priceColumnExists = df.columns.contains("Price")
  println(s"Does price column exist = $priceColumnExists")

  import sparkSession.sqlContext.implicits._

  val targets = Seq(("Plain Donut", Array(1.50, 2.0)), ("Vanilla Donut", Array(2.0, 2.50)), ("Strawberry Donut", Array(2.50, 3.50)))
  val df2 = sparkSession
    .createDataFrame(targets)
    .toDF("Name", "Prices")

  df2.show()
  df2.printSchema()

  val df3 = df2
    .select(
      $"Name",
      $"Prices"(0).as("Low Price"),
      $"Prices"(1).as("High Price")
    )

  df3.show()



}

OUTPUT

/home/raj/jdk1.8.0_202/bin/java -javaagent:/home/raj/Downloads/idea-IC-222.4167.29/lib/idea_rt.jar=40847:/home/raj/Downloads/idea-IC-222.4167.29/bin -Dfile.encoding=UTF-8 -classpath /home/raj/jdk1.8.0_202/jre/lib/charsets.jar:/home/raj/jdk1.8.0_202/jre/lib/deploy.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/cldrdata.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/dnsns.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/jaccess.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/jfxrt.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/localedata.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/nashorn.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/sunec.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/sunjce_provider.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/sunpkcs11.jar:/home/raj/jdk1.8.0_202/jre/lib/ext/zipfs.jar:/home/raj/jdk1.8.0_202/jre/lib/javaws.jar:/home/raj/jdk1.8.0_202/jre/lib/jce.jar:/home/raj/jdk1.8.0_202/jre/lib/jfr.jar:/home/raj/jdk1.8.0_202/jre/lib/jfxswt.jar:/home/raj/jdk1.8.0_202/jre/lib/jsse.jar:/home/raj/jdk1.8.0_202/jre/lib/management-agent.jar:/home/raj/jdk1.8.0_202/jre/lib/plugin.jar:/home/raj/jdk1.8.0_202/jre/lib/resources.jar:/home/raj/jdk1.8.0_202/jre/lib/rt.jar:/home/raj/eclipse-workspace/untitled1/target/classes:/home/raj/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.12.jar:/home/raj/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.11.12.jar:/home/raj/.ivy2/cache/org.scala-lang.modules/scala-xml_2.11/bundles/scala-xml_2.11-1.0.5.jar:/home/raj/.ivy2/cache/org.scala-lang.modules/scala-parser-combinators_2.11/bundles/scala-parser-combinators_2.11-1.0.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/activation-1.1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/aircompressor-0.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/antlr-2.7.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/antlr-runtime-3.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/antlr4-runtime-4.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/aopalliance-1.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/aopalliance-repackaged-2.4.0-b34.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/apache-log4j-extras-1.2.17.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/apacheds-i18n-2.0.0-M15.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/apacheds-kerberos-codec-2.0.0-M15.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/api-asn1-api-1.0.0-M20.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/api-util-1.0.0-M20.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/arpack_combined_all-0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/arrow-format-0.8.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/arrow-memory-0.8.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/automaton-1.11-8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/avro-1.7.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/avro-ipc-1.7.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/avro-mapred-1.7.7-hadoop2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/base64-2.3.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/bcprov-jdk15on-1.58.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/bonecp-0.8.0.RELEASE.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/breeze-macros_2.11-0.13.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/breeze_2.11-0.13.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/calcite-avatica-1.2.0-incubating.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/calcite-core-1.2.0-incubating.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/calcite-linq4j-1.2.0-incubating.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/chill-java-0.8.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/chill_2.11-0.8.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-beanutils-1.7.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-beanutils-core-1.8.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-cli-1.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-codec-1.10.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-collections-3.2.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-compiler-3.0.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-compress-1.4.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-configuration-1.6.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-crypto-1.0.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-dbcp-1.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-digester-1.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-httpclient-3.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-io-2.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-lang-2.6.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-lang3-3.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-logging-1.1.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-math3-3.4.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-net-2.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/commons-pool-1.5.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/compress-lzf-1.0.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/core-1.1.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/curator-client-2.6.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/curator-framework-2.6.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/curator-recipes-2.6.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/datanucleus-api-jdo-3.2.6.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/datanucleus-core-3.2.10.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/datanucleus-rdbms-3.2.9.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/derby-10.12.1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/eigenbase-properties-1.1.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/flatbuffers-1.2.0-3f79e055.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/generex-1.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/gson-2.2.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/guava-14.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/guice-3.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/guice-servlet-3.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-annotations-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-auth-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-common-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-hdfs-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-mapreduce-client-app-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-mapreduce-client-common-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-mapreduce-client-core-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-mapreduce-client-jobclient-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-mapreduce-client-shuffle-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-yarn-api-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-yarn-client-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-yarn-common-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-yarn-server-common-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hadoop-yarn-server-web-proxy-2.6.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hive-beeline-1.2.1.spark2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hive-cli-1.2.1.spark2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hive-exec-1.2.1.spark2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hive-jdbc-1.2.1.spark2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hive-metastore-1.2.1.spark2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hk2-api-2.4.0-b34.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hk2-locator-2.4.0-b34.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hk2-utils-2.4.0-b34.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/hppc-0.7.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/htrace-core-3.0.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/httpclient-4.5.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/httpcore-4.4.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/ivy-2.4.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-annotations-2.6.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-core-2.6.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-core-asl-1.9.13.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-databind-2.6.7.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-dataformat-yaml-2.6.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-jaxrs-1.9.13.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-mapper-asl-1.9.13.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-module-jaxb-annotations-2.6.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-module-paranamer-2.7.9.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-module-scala_2.11-2.6.7.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jackson-xc-1.9.13.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/janino-3.0.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/java-xmlbuilder-1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/JavaEWAH-0.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javassist-3.18.1-GA.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javax.annotation-api-1.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javax.inject-1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javax.inject-2.4.0-b34.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javax.servlet-api-3.1.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javax.ws.rs-api-2.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/javolution-5.5.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jaxb-api-2.2.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jcl-over-slf4j-1.7.16.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jdo-api-3.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-client-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-common-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-container-servlet-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-container-servlet-core-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-guava-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-media-jaxb-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jersey-server-2.22.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jets3t-0.9.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jetty-6.1.26.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jetty-util-6.1.26.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jline-2.12.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/joda-time-2.9.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jodd-core-3.5.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jpam-1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/json4s-ast_2.11-3.2.11.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/json4s-core_2.11-3.2.11.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/json4s-jackson_2.11-3.2.11.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jsr305-1.3.9.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jta-1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jtransforms-2.4.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/jul-to-slf4j-1.7.16.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/kryo-shaded-3.0.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/kubernetes-client-3.0.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/kubernetes-model-2.0.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/leveldbjni-all-1.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/libfb303-0.9.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/libthrift-0.9.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/log4j-1.2.17.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/logging-interceptor-3.8.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/lz4-java-1.4.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/machinist_2.11-0.6.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/macro-compat_2.11-1.1.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/mesos-1.4.0-shaded-protobuf.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/metrics-core-3.1.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/metrics-graphite-3.1.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/metrics-json-3.1.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/metrics-jvm-3.1.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/minlog-1.3.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/netty-3.9.9.Final.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/netty-all-4.1.17.Final.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/objenesis-2.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/okhttp-3.8.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/okio-1.13.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/opencsv-2.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/orc-core-1.4.4-nohive.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/orc-mapreduce-1.4.4-nohive.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/oro-2.0.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/osgi-resource-locator-1.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/paranamer-2.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-column-1.8.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-common-1.8.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-encoding-1.8.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-format-2.3.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-hadoop-1.8.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-hadoop-bundle-1.6.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/parquet-jackson-1.8.3.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/protobuf-java-2.5.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/py4j-0.10.7.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/pyrolite-4.13.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/RoaringBitmap-0.5.11.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scala-compiler-2.11.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scala-library-2.11.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scala-parser-combinators_2.11-1.0.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scala-reflect-2.11.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scala-xml_2.11-1.0.5.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/scalap-2.11.8.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/shapeless_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/slf4j-api-1.7.16.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/slf4j-log4j12-1.7.16.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/snakeyaml-1.15.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/snappy-0.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/snappy-java-1.1.2.6.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-catalyst_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-core_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-graphx_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-hive-thriftserver_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-hive_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-kubernetes_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-kvstore_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-launcher_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-mesos_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-mllib-local_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-mllib_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-network-common_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-network-shuffle_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-repl_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-sketch_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-sql_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-streaming_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-tags_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-unsafe_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spark-yarn_2.11-2.3.2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spire-macros_2.11-0.13.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/spire_2.11-0.13.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/ST4-4.0.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/stax-api-1.0-2.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/stax-api-1.0.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/stream-2.7.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/stringtemplate-3.2.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/super-csv-2.2.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/univocity-parsers-2.5.9.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/validation-api-1.1.0.Final.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/xbean-asm5-shaded-4.4.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/xercesImpl-2.9.1.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/xmlenc-0.52.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/xz-1.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/zjsonpatch-0.3.0.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/zookeeper-3.4.6.jar:/home/raj/spark-2.3.2-bin-hadoop2.6/jars/zstd-jni-1.3.2-2.jar pack.Concatenate_DataFrames
2022-12-02 05:57:53 WARN  Utils:66 - Your hostname, Hp-Notebook resolves to a loopback address: 127.0.1.1; using 192.168.43.52 instead (on interface wlo1)
2022-12-02 05:57:53 WARN  Utils:66 - Set SPARK_LOCAL_IP if you need to bind to another address
2022-12-02 05:57:53 INFO  SparkContext:54 - Running Spark version 2.3.2
2022-12-02 05:57:55 WARN  NativeCodeLoader:62 - Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
2022-12-02 05:57:55 INFO  SparkContext:54 - Submitted application: Learn Spark
2022-12-02 05:57:56 INFO  SecurityManager:54 - Changing view acls to: raj
2022-12-02 05:57:56 INFO  SecurityManager:54 - Changing modify acls to: raj
2022-12-02 05:57:56 INFO  SecurityManager:54 - Changing view acls groups to: 
2022-12-02 05:57:56 INFO  SecurityManager:54 - Changing modify acls groups to: 
2022-12-02 05:57:56 INFO  SecurityManager:54 - SecurityManager: authentication disabled; ui acls disabled; users  with view permissions: Set(raj); groups with view permissions: Set(); users  with modify permissions: Set(raj); groups with modify permissions: Set()
2022-12-02 05:57:56 INFO  Utils:54 - Successfully started service 'sparkDriver' on port 39123.
2022-12-02 05:57:57 INFO  SparkEnv:54 - Registering MapOutputTracker
2022-12-02 05:57:57 INFO  SparkEnv:54 - Registering BlockManagerMaster
2022-12-02 05:57:57 INFO  BlockManagerMasterEndpoint:54 - Using org.apache.spark.storage.DefaultTopologyMapper for getting topology information
2022-12-02 05:57:57 INFO  BlockManagerMasterEndpoint:54 - BlockManagerMasterEndpoint up
2022-12-02 05:57:57 INFO  DiskBlockManager:54 - Created local directory at /tmp/blockmgr-db0f73cd-d971-4f36-8bbd-47022f6999aa
2022-12-02 05:57:57 INFO  MemoryStore:54 - MemoryStore started with capacity 806.7 MB
2022-12-02 05:57:57 INFO  SparkEnv:54 - Registering OutputCommitCoordinator
2022-12-02 05:57:57 INFO  log:192 - Logging initialized @6834ms
2022-12-02 05:57:58 INFO  Server:351 - jetty-9.3.z-SNAPSHOT, build timestamp: unknown, git hash: unknown
2022-12-02 05:57:58 INFO  Server:419 - Started @7156ms
2022-12-02 05:57:58 INFO  AbstractConnector:278 - Started ServerConnector@f9d87b{HTTP/1.1,[http/1.1]}{0.0.0.0:4040}
2022-12-02 05:57:58 INFO  Utils:54 - Successfully started service 'SparkUI' on port 4040.
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@33352f32{/jobs,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@841e575{/jobs/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@27a5328c{/jobs/job,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6c345c5f{/jobs/job/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6b5966e1{/stages,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@65e61854{/stages/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1568159{/stages/stage,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3af17be2{/stages/stage/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@f9879ac{/stages/pool,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@37f21974{/stages/pool/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5f4d427e{/storage,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@6e521c1e{/storage/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@224b4d61{/storage/rdd,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5d5d9e5{/storage/rdd/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@303e3593{/environment,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@4ef27d66{/environment/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@362a019c{/executors,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@1d9bec4d{/executors/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@5c48c0c0{/executors/threadDump,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@10c8f62{/executors/threadDump/json,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@674c583e{/static,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@3954d008{/,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2f94c4db{/api,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@64bc21ac{/jobs/job/kill,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@493dfb8e{/stages/stage/kill,null,AVAILABLE,@Spark}
2022-12-02 05:57:58 INFO  SparkUI:54 - Bound SparkUI to 0.0.0.0, and started at http://192.168.43.52:4040
2022-12-02 05:57:59 INFO  Executor:54 - Starting executor ID driver on host localhost
2022-12-02 05:57:59 INFO  Utils:54 - Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 46619.
2022-12-02 05:57:59 INFO  NettyBlockTransferService:54 - Server created on 192.168.43.52:46619
2022-12-02 05:57:59 INFO  BlockManager:54 - Using org.apache.spark.storage.RandomBlockReplicationPolicy for block replication policy
2022-12-02 05:57:59 INFO  BlockManagerMaster:54 - Registering BlockManager BlockManagerId(driver, 192.168.43.52, 46619, None)
2022-12-02 05:57:59 INFO  BlockManagerMasterEndpoint:54 - Registering block manager 192.168.43.52:46619 with 806.7 MB RAM, BlockManagerId(driver, 192.168.43.52, 46619, None)
2022-12-02 05:57:59 INFO  BlockManagerMaster:54 - Registered BlockManager BlockManagerId(driver, 192.168.43.52, 46619, None)
2022-12-02 05:57:59 INFO  BlockManager:54 - Initialized BlockManager: BlockManagerId(driver, 192.168.43.52, 46619, None)
2022-12-02 05:58:00 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@78b236a0{/metrics/json,null,AVAILABLE,@Spark}
2022-12-02 05:58:05 INFO  SharedState:54 - Setting hive.metastore.warehouse.dir ('null') to the value of spark.sql.warehouse.dir ('file:/home/raj/eclipse-workspace/untitled1/spark-warehouse/').
2022-12-02 05:58:05 INFO  SharedState:54 - Warehouse path is 'file:/home/raj/eclipse-workspace/untitled1/spark-warehouse/'.
2022-12-02 05:58:05 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@4cfa83f9{/SQL,null,AVAILABLE,@Spark}
2022-12-02 05:58:05 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@321ca237{/SQL/json,null,AVAILABLE,@Spark}
2022-12-02 05:58:05 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@516592b1{/SQL/execution,null,AVAILABLE,@Spark}
2022-12-02 05:58:05 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@4cffcc61{/SQL/execution/json,null,AVAILABLE,@Spark}
2022-12-02 05:58:05 INFO  ContextHandler:781 - Started o.s.j.s.ServletContextHandler@2a235b8e{/static/sql,null,AVAILABLE,@Spark}
2022-12-02 05:58:07 INFO  StateStoreCoordinatorRef:54 - Registered StateStoreCoordinator endpoint
2022-12-02 05:58:10 INFO  CodeGenerator:54 - Code generated in 672.146687 ms
2022-12-02 05:58:10 INFO  CodeGenerator:54 - Code generated in 72.19469 ms
+---+-------------+-----+
| Id|   Donut Name|Price|
+---+-------------+-----+
|111|  plain donut|  1.5|
|222|vanilla donut|  2.0|
|333| glazed donut|  2.5|
+---+-------------+-----+

2022-12-02 05:58:10 INFO  CodeGenerator:54 - Code generated in 42.325917 ms
2022-12-02 05:58:10 INFO  CodeGenerator:54 - Code generated in 78.731716 ms
+---+---------+
| Id|Inventory|
+---+---------+
|111|       10|
|222|       20|
|333|       30|
+---+---------+

2022-12-02 05:58:12 INFO  CodeGenerator:54 - Code generated in 72.732729 ms
2022-12-02 05:58:12 INFO  ContextCleaner:54 - Cleaned accumulator 1
2022-12-02 05:58:12 INFO  ContextCleaner:54 - Cleaned accumulator 0
2022-12-02 05:58:13 INFO  CodeGenerator:54 - Code generated in 62.740449 ms
2022-12-02 05:58:13 INFO  CodeGenerator:54 - Code generated in 43.539398 ms
2022-12-02 05:58:13 INFO  SparkContext:54 - Starting job: run at ThreadPoolExecutor.java:1149
2022-12-02 05:58:14 INFO  DAGScheduler:54 - Got job 0 (run at ThreadPoolExecutor.java:1149) with 3 output partitions
2022-12-02 05:58:14 INFO  DAGScheduler:54 - Final stage: ResultStage 0 (run at ThreadPoolExecutor.java:1149)
2022-12-02 05:58:14 INFO  DAGScheduler:54 - Parents of final stage: List()
2022-12-02 05:58:14 INFO  DAGScheduler:54 - Missing parents: List()
2022-12-02 05:58:14 INFO  DAGScheduler:54 - Submitting ResultStage 0 (MapPartitionsRDD[3] at run at ThreadPoolExecutor.java:1149), which has no missing parents
2022-12-02 05:58:15 INFO  MemoryStore:54 - Block broadcast_0 stored as values in memory (estimated size 6.2 KB, free 806.7 MB)
2022-12-02 05:58:15 INFO  MemoryStore:54 - Block broadcast_0_piece0 stored as bytes in memory (estimated size 3.1 KB, free 806.7 MB)
2022-12-02 05:58:15 INFO  BlockManagerInfo:54 - Added broadcast_0_piece0 in memory on 192.168.43.52:46619 (size: 3.1 KB, free: 806.7 MB)
2022-12-02 05:58:15 INFO  SparkContext:54 - Created broadcast 0 from broadcast at DAGScheduler.scala:1039
2022-12-02 05:58:16 INFO  DAGScheduler:54 - Submitting 3 missing tasks from ResultStage 0 (MapPartitionsRDD[3] at run at ThreadPoolExecutor.java:1149) (first 15 tasks are for partitions Vector(0, 1, 2))
2022-12-02 05:58:16 INFO  TaskSchedulerImpl:54 - Adding task set 0.0 with 3 tasks
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Starting task 0.0 in stage 0.0 (TID 0, localhost, executor driver, partition 0, PROCESS_LOCAL, 8047 bytes)
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Starting task 1.0 in stage 0.0 (TID 1, localhost, executor driver, partition 1, PROCESS_LOCAL, 8047 bytes)
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Starting task 2.0 in stage 0.0 (TID 2, localhost, executor driver, partition 2, PROCESS_LOCAL, 8047 bytes)
2022-12-02 05:58:16 INFO  Executor:54 - Running task 2.0 in stage 0.0 (TID 2)
2022-12-02 05:58:16 INFO  Executor:54 - Running task 0.0 in stage 0.0 (TID 0)
2022-12-02 05:58:16 INFO  Executor:54 - Running task 1.0 in stage 0.0 (TID 1)
2022-12-02 05:58:16 INFO  Executor:54 - Finished task 2.0 in stage 0.0 (TID 2). 1366 bytes result sent to driver
2022-12-02 05:58:16 INFO  Executor:54 - Finished task 0.0 in stage 0.0 (TID 0). 1409 bytes result sent to driver
2022-12-02 05:58:16 INFO  Executor:54 - Finished task 1.0 in stage 0.0 (TID 1). 1366 bytes result sent to driver
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Finished task 1.0 in stage 0.0 (TID 1) in 589 ms on localhost (executor driver) (1/3)
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Finished task 2.0 in stage 0.0 (TID 2) in 614 ms on localhost (executor driver) (2/3)
2022-12-02 05:58:16 INFO  TaskSetManager:54 - Finished task 0.0 in stage 0.0 (TID 0) in 711 ms on localhost (executor driver) (3/3)
2022-12-02 05:58:16 INFO  TaskSchedulerImpl:54 - Removed TaskSet 0.0, whose tasks have all completed, from pool 
2022-12-02 05:58:16 INFO  DAGScheduler:54 - ResultStage 0 (run at ThreadPoolExecutor.java:1149) finished in 2.112 s
2022-12-02 05:58:16 INFO  DAGScheduler:54 - Job 0 finished: run at ThreadPoolExecutor.java:1149, took 3.167502 s
2022-12-02 05:58:17 INFO  CodeGenerator:54 - Code generated in 52.276761 ms
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_1 stored as values in memory (estimated size 8.0 MB, free 798.7 MB)
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_1_piece0 stored as bytes in memory (estimated size 226.0 B, free 798.7 MB)
2022-12-02 05:58:17 INFO  BlockManagerInfo:54 - Added broadcast_1_piece0 in memory on 192.168.43.52:46619 (size: 226.0 B, free: 806.7 MB)
2022-12-02 05:58:17 INFO  SparkContext:54 - Created broadcast 1 from run at ThreadPoolExecutor.java:1149
2022-12-02 05:58:17 INFO  CodeGenerator:54 - Code generated in 181.654889 ms
2022-12-02 05:58:17 INFO  CodeGenerator:54 - Code generated in 51.395939 ms
2022-12-02 05:58:17 INFO  SparkContext:54 - Starting job: show at Concatenate_DataFrames.scala:18
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Got job 1 (show at Concatenate_DataFrames.scala:18) with 1 output partitions
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Final stage: ResultStage 1 (show at Concatenate_DataFrames.scala:18)
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Parents of final stage: List()
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Missing parents: List()
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Submitting ResultStage 1 (MapPartitionsRDD[8] at show at Concatenate_DataFrames.scala:18), which has no missing parents
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_2 stored as values in memory (estimated size 10.5 KB, free 798.7 MB)
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_2_piece0 stored as bytes in memory (estimated size 4.6 KB, free 798.7 MB)
2022-12-02 05:58:17 INFO  BlockManagerInfo:54 - Added broadcast_2_piece0 in memory on 192.168.43.52:46619 (size: 4.6 KB, free: 806.7 MB)
2022-12-02 05:58:17 INFO  SparkContext:54 - Created broadcast 2 from broadcast at DAGScheduler.scala:1039
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Submitting 1 missing tasks from ResultStage 1 (MapPartitionsRDD[8] at show at Concatenate_DataFrames.scala:18) (first 15 tasks are for partitions Vector(0))
2022-12-02 05:58:17 INFO  TaskSchedulerImpl:54 - Adding task set 1.0 with 1 tasks
2022-12-02 05:58:17 INFO  TaskSetManager:54 - Starting task 0.0 in stage 1.0 (TID 3, localhost, executor driver, partition 0, PROCESS_LOCAL, 8071 bytes)
2022-12-02 05:58:17 INFO  Executor:54 - Running task 0.0 in stage 1.0 (TID 3)
2022-12-02 05:58:17 INFO  Executor:54 - Finished task 0.0 in stage 1.0 (TID 3). 1469 bytes result sent to driver
2022-12-02 05:58:17 INFO  TaskSetManager:54 - Finished task 0.0 in stage 1.0 (TID 3) in 86 ms on localhost (executor driver) (1/1)
2022-12-02 05:58:17 INFO  TaskSchedulerImpl:54 - Removed TaskSet 1.0, whose tasks have all completed, from pool 
2022-12-02 05:58:17 INFO  DAGScheduler:54 - ResultStage 1 (show at Concatenate_DataFrames.scala:18) finished in 0.185 s
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Job 1 finished: show at Concatenate_DataFrames.scala:18, took 0.218706 s
2022-12-02 05:58:17 INFO  SparkContext:54 - Starting job: show at Concatenate_DataFrames.scala:18
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Got job 2 (show at Concatenate_DataFrames.scala:18) with 2 output partitions
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Final stage: ResultStage 2 (show at Concatenate_DataFrames.scala:18)
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Parents of final stage: List()
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Missing parents: List()
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Submitting ResultStage 2 (MapPartitionsRDD[8] at show at Concatenate_DataFrames.scala:18), which has no missing parents
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_3 stored as values in memory (estimated size 10.5 KB, free 798.7 MB)
2022-12-02 05:58:17 INFO  MemoryStore:54 - Block broadcast_3_piece0 stored as bytes in memory (estimated size 4.6 KB, free 798.7 MB)
2022-12-02 05:58:17 INFO  BlockManagerInfo:54 - Added broadcast_3_piece0 in memory on 192.168.43.52:46619 (size: 4.6 KB, free: 806.7 MB)
2022-12-02 05:58:17 INFO  SparkContext:54 - Created broadcast 3 from broadcast at DAGScheduler.scala:1039
2022-12-02 05:58:17 INFO  DAGScheduler:54 - Submitting 2 missing tasks from ResultStage 2 (MapPartitionsRDD[8] at show at Concatenate_DataFrames.scala:18) (first 15 tasks are for partitions Vector(1, 2))
2022-12-02 05:58:17 INFO  TaskSchedulerImpl:54 - Adding task set 2.0 with 2 tasks
2022-12-02 05:58:17 INFO  TaskSetManager:54 - Starting task 0.0 in stage 2.0 (TID 4, localhost, executor driver, partition 1, PROCESS_LOCAL, 8071 bytes)
2022-12-02 05:58:17 INFO  TaskSetManager:54 - Starting task 1.0 in stage 2.0 (TID 5, localhost, executor driver, partition 2, PROCESS_LOCAL, 8071 bytes)
2022-12-02 05:58:17 INFO  Executor:54 - Running task 0.0 in stage 2.0 (TID 4)
2022-12-02 05:58:17 INFO  Executor:54 - Running task 1.0 in stage 2.0 (TID 5)
2022-12-02 05:58:17 INFO  Executor:54 - Finished task 1.0 in stage 2.0 (TID 5). 1429 bytes result sent to driver
2022-12-02 05:58:17 INFO  TaskSetManager:54 - Finished task 1.0 in stage 2.0 (TID 5) in 26 ms on localhost (executor driver) (1/2)
2022-12-02 05:58:18 INFO  Executor:54 - Finished task 0.0 in stage 2.0 (TID 4). 1472 bytes result sent to driver
2022-12-02 05:58:18 INFO  TaskSetManager:54 - Finished task 0.0 in stage 2.0 (TID 4) in 50 ms on localhost (executor driver) (2/2)
2022-12-02 05:58:18 INFO  TaskSchedulerImpl:54 - Removed TaskSet 2.0, whose tasks have all completed, from pool 
2022-12-02 05:58:18 INFO  DAGScheduler:54 - ResultStage 2 (show at Concatenate_DataFrames.scala:18) finished in 0.104 s
2022-12-02 05:58:18 INFO  DAGScheduler:54 - Job 2 finished: show at Concatenate_DataFrames.scala:18, took 0.120085 s
+---+-------------+-----+---------+
| Id|   Donut Name|Price|Inventory|
+---+-------------+-----+---------+
|111|  plain donut|  1.5|       10|
|222|vanilla donut|  2.0|       20|
|333| glazed donut|  2.5|       30|
+---+-------------+-----+---------+

+-------------+-----+
|   Donut Name|Price|
+-------------+-----+
|  plain donut|  1.5|
|vanilla donut|  2.0|
| glazed donut|  2.5|
+-------------+-----+

Does price column exist = true
2022-12-02 05:58:18 INFO  CodeGenerator:54 - Code generated in 85.793437 ms
2022-12-02 05:58:18 INFO  CodeGenerator:54 - Code generated in 48.647699 ms
+----------------+----------+
|            Name|    Prices|
+----------------+----------+
|     Plain Donut|[1.5, 2.0]|
|   Vanilla Donut|[2.0, 2.5]|
|Strawberry Donut|[2.5, 3.5]|
+----------------+----------+

root
 |-- Name: string (nullable = true)
 |-- Prices: array (nullable = true)
 |    |-- element: double (containsNull = false)

2022-12-02 05:58:19 INFO  CodeGenerator:54 - Code generated in 32.028806 ms
2022-12-02 05:58:19 INFO  CodeGenerator:54 - Code generated in 38.585269 ms
+----------------+---------+----------+
|            Name|Low Price|High Price|
+----------------+---------+----------+
|     Plain Donut|      1.5|       2.0|
|   Vanilla Donut|      2.0|       2.5|
|Strawberry Donut|      2.5|       3.5|
+----------------+---------+----------+

2022-12-02 05:58:19 INFO  SparkContext:54 - Invoking stop() from shutdown hook
2022-12-02 05:58:19 INFO  AbstractConnector:318 - Stopped Spark@f9d87b{HTTP/1.1,[http/1.1]}{0.0.0.0:4040}
2022-12-02 05:58:19 INFO  SparkUI:54 - Stopped Spark web UI at http://192.168.43.52:4040
2022-12-02 05:58:19 INFO  MapOutputTrackerMasterEndpoint:54 - MapOutputTrackerMasterEndpoint stopped!
2022-12-02 05:58:19 INFO  MemoryStore:54 - MemoryStore cleared
2022-12-02 05:58:19 INFO  BlockManager:54 - BlockManager stopped
2022-12-02 05:58:19 INFO  BlockManagerMaster:54 - BlockManagerMaster stopped
2022-12-02 05:58:19 INFO  OutputCommitCoordinator$OutputCommitCoordinatorEndpoint:54 - OutputCommitCoordinator stopped!
2022-12-02 05:58:19 INFO  SparkContext:54 - Successfully stopped SparkContext
2022-12-02 05:58:19 INFO  ShutdownHookManager:54 - Shutdown hook called
2022-12-02 05:58:19 INFO  ShutdownHookManager:54 - Deleting directory /tmp/spark-69e76972-ab18-4a5d-8b4b-e9f7b6c06cf7

Process finished with exit code 0
