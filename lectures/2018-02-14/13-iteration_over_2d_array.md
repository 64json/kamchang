# Iteration Over 2D Array

Suppose you have a 2D array named `array`:

```java
int[][] array2d = {
  {0, 1, 2},
  {3, 4, 5},
  {6, 7, 8},
  {9, 10, 11},
};
```

Below are some of the most frequently used ways of iterating over it.

+ [Nested `for` Statements](#nested-for-statements)
+ [Nested `foreach` Statements](#nested-foreach-statements)
+ [Single `for` Statement](#single-for-statement)

## Nested `for` Statements

```java
for (int i = 0; i < array2d.length; i++) {
  for (int j = 0; j < array2d[i].length; j++) {
    System.out.println(array2d[i][j]);
  }
}
```

## Nested `foreach` Statements

```java
for (int[] array1d : array2d) {
  for (int element : array1d) {
    System.out.println(element);
  }
}
```

## Single `for` Statement

**Note** that this method can only be used when every array element has the same length.

```java
int rows = array2d.length;
int columns = array2d[0].length;
for (int i = 0; i < rows * columns; i++) {
  int x = i / columns;
  int y = i % columns;
  System.out.println(array2d[x][y]);
}
```
