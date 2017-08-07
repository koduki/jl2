Java Little Library(JL2)
======================

This is a very simple java library.
This library support tuple, collection extentions, and so on.

How to use
------------

Please add to "pom.xml".

```xml 
<repositories>
    <repository>
        <id>koduki-repos</id>
        <url>https://raw.githubusercontent.com/koduki/koduki.github.io/mvn-repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>cn.orz.pascal</groupId>
        <artifactId>jl2</artifactId>
        <version>0.1</version>
    </dependency>
</dependencies>
```

Example
------------

### DSL

Please import follwoing "static import". 

This is a extention for easy access to this library API.

```java
import static cn.orz.pascal.jl2.Extentions.*;
```

### Tuple

Tuple can realize multi type value by Java.

This is almost Scala's Tuple. Tuple supports up to twenty one columns.

```java
Tuple2<String, Integer> x = new Tuple2<>("A", 10);
Tuple2<Integer, String> y = $(1, "B"); // '$' method is a syntax sugar.
Tuple4<Integer, String, Boolean, List<Integer>> x = $(1, "A", true, Arrays.asList(2));
Tuple2<Integer, Tuple2<String, String>> z = $(1, $("A", "B")); // Nested tuple is OK.
````

### Collection builder

This is Collection builder like Scala.

```java
Set<String> set = set("a", "b");
List<String> list = list("a", "b");
Map<Integer, String> map = map($(1, "a"), $(2, "b"));
ImmutableMap<String, String> imap = imap($("k1", "v1"), $("k2", "v2"));
```

### Immutable operations

This "Map" is immutable.
We don't need to be careful about changing value by misstake.

```java
// concat set as new object.
Set<Integer> set1 = set(1, 2);
Set<Integer> set2 = set(3);
Set<Integer> concatedSet = concat(set1, set2);

// create immutable map
ImmutableMap<String, String> map = imap($("k1", "v1"), $("k2", "v2"));
ImmutableMap<String, String> addedMap = map.put("k3", "v3");
ImmutableMap<String, String> removedMap = map.remove("k2");
```

### JDBC Wrapper for StreamAPI

JDBC throws SQLException. This is Checked Exception.
That mean, it is very painful to use JDBC with Lambada.

This API wraps ResultSet to integrate Lambda.

`WARN: This API donsen't support "parallel"`

```java
try (
        Connection con = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        PreparedStatement pt = con.prepareStatement("select * from persons ");) {
    List<String> ids = QueryStream.of(pt.executeQuery())
            .map(r -> r.getString(1))
            .collect(Collectors.toList());

    assertThat(ids.size(), is(4));
    assertThat(ids.get(0), is("1"));
    assertThat(ids.get(1), is("2"));
    assertThat(ids.get(2), is("3"));
    assertThat(ids.get(3), is("4"));
}
```
