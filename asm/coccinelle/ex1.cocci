@@
typedef ide_hwif_t;
ide_hwif_t *dev;
expression data;
@@

- dev->hwif_data = data
+ ide_set_hwifdata(dev,data)

@@
ide_hwif_t *dev;
@@

- dev->hwif_data
+ ide_get_hwifdata(dev)