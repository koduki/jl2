Java Little Library
======================

This is a very simple java library.
This library support tuple, collection extentions, and so on.

Example
------------

### Tuple

```java
Tuple2<String, Integer> x = new Tuple2<>("A", 10);
Tuple2<Integer, String> y = $(1, "B"); // $ method is syntax sugar
Tuple4<Integer, String, Boolean, List<Integer>> x = $(1, "A", true, Arrays.asList(2));
````

### Collection generators

```java
Set<String> set1 = set("a", "b");
List<String> list1 = list("a", "b");
Map<Integer, String> map = map($(1, "a"), $(2, "b"));
```

### Immutable operations

```java
// concat set as new object.
Set<Integer> set1 = set(1, 2);
Set<Integer> set2 = set(3);
Set<Integer> result = concat(set1, set2);

// create immutable map
ImmutableMap<String, String> map1 = mapi($("k1", "v1"), $("k2", "v2"));
ImmutableMap<String, String> result = map1.put("k3", "v3");
```

