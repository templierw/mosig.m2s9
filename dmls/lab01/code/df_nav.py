from pyspark import SparkContext
from pyspark.sql import SparkSession
  
spark = SparkSession.builder.appName("DataFrame").getOrCreate()
  
df = spark.read.options(header='True', inferSchema='True', delimiter=',').csv("./data/CLIWOC15.csv")

print(df.select('Nationality').distinct().show())
