@@
typedef device
device *dev
expression data
@@

-dev->platform_data = data
+dev_set_platdata(dev,data)