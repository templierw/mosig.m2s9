from pyspark.context import SparkContext

sc = SparkContext("local")
sc.setLogLevel('OFF')
# define a first RDD
lines = sc.textFile("data.txt")


# define a second RDD
lineLengths = lines.map(lambda s: len(s))
# Make the RDD persist in memory
#lineLengths.cache()
# At this point no transformation has been run
# Launch the evaluation of all transformations
totalLength = lineLengths.reduce(lambda a, b: a + b)

print(totalLength)