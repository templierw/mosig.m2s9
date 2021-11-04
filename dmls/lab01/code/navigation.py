import sys
from typing import Counter
from pyspark import SparkContext
import time

# Finds out the index of "name" in the array firstLine 
# returns -1 if it cannot find it
def findCol(firstLine, name):
	return firstLine.index(name) if name in firstLine else -1


#### Driver program

# start spark with 1 worker thread
sc = SparkContext("local[4]")
sc.setLogLevel("ERROR")


# read the input file into an RDD[String]
wholeFile = sc.textFile("./data/CLIWOC15.csv")

# The first line of the file defines the name of each column in the cvs file
# We store it as an array in the driver program
firstLine = wholeFile.filter(lambda x: "RecID" in x).collect()[0].replace('"','').split(',')
# filter out the first line from the initial RDD
entries = wholeFile.filter(lambda x: not ("RecID" in x))
# split each line into an array of items
entries = entries.map(lambda x : x.split(','))

# keep the RDD in memory
entries.cache()
"""
##### Create an RDD that contains all nationalities observed in the
##### different entries

# Information about the nationality is provided in the column named
# "Nationality"

# First find the index of the column corresponding to the "Nationality"
column_index=findCol(firstLine, "Nationality")
print(f"Nationality corresponds to column {column_index}")

# Use 'map' to create a RDD with all nationalities and 'distinct' to remove duplicates 
nationalities = entries.map(lambda x: x[column_index].replace(' ', '')).distinct()

# Display the 5 first nationalities
print("A few examples of nationalities:")
for elem in nationalities.sortBy(lambda x: x).take(5):
	print(elem)

# 4.4.2
print(f"#observations = {entries.count()}")
#4.4.3
column_index=findCol(firstLine, "Year")
years = entries.map(lambda x: x[column_index]).distinct()
print(f"#years = {years.count()}")
#4.4.4
print(f"# min year = {years.min()}")
print(f"# max year = {years.max()}")
#4.4.5
year_count = entries.map(lambda x: x[column_index]).countByValue()
print(min(year_count, key=year_count.get), min(year_count.values()))
print(max(year_count, key=year_count.get), max(year_count.values()))
#4.4.6
column_index=findCol(firstLine, "VoyageFrom")
vfrom = entries.map(lambda x: x[column_index]).distinct().count()
print(vfrom)
vfrom2 = entries.map(lambda x: (x[column_index], 1)).reduceByKey(lambda a,b: a + b).count()
print(vfrom2)
#4.4.7
vfrom3 = entries.map(lambda x: (x[column_index], 1)).reduceByKey(lambda a,b: a + b).sortBy(lambda x: x[1], ascending=False).take(10)
for k,v in vfrom3:
	print(f"{k}: {v}")
"""
#4.4.8
vfrom_idx=findCol(firstLine, "VoyageFrom")
vto_idx=findCol(firstLine, "VoyageTo")

def road_tuple(vfrom, vto):
	return (
		(vfrom, vto) if vfrom < vto else (vto, vfrom)
	)

voy = entries.map(lambda line: (
				(road_tuple(line[vfrom_idx].replace('"',''),line[vto_idx].replace('"','')))
				, 1))\
			 .reduceByKey(lambda v1,v2: v1+v2)\
			 .sortBy(lambda x: x[1], False)\
			 .take(10)
for k,v in voy:
	print(f"{k}: {v}")





# prevent the program from terminating immediatly
input("Press Enter to continue...")
