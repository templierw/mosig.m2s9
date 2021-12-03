@@
expression var;
expression p1;
expression p2;
@@

- var = kmalloc(p1, p2)
+ var = kzalloc(p1,p2)
...
- memset(var,0,p1);