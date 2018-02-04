# String Methods

+ [Syntax](#syntax)
+ [Frequently Used Methods](#frequently-used-methods)

## Syntax
```java
int seventhLetter = "Hello World".charAt(6);
```

## Frequently Used Methods

+ `charAt(int index)`

  Returns the char value at the specified index.
  
+ `compareTo(String anotherString)`

  Compares two strings lexicographically.
  
+ `concat(String str)`

  Concatenates the specified string to the end of this string.
  
+ `contains(CharSequence s)`

  Returns true if and only if this string contains the specified sequence of char values.
  
+ `endsWith(String suffix)`

  Tests if this string ends with the specified suffix.
  
+ `equals(Object anObject)`

  Compares this string to the specified object.
  
+ `indexOf(int ch)`

  Returns the index within this string of the first occurrence of the specified character.
  
+ `lastIndexOf(int ch)`

  Returns the index within this string of the last occurrence of the specified character.
  
+ `length()`

  Returns the length of this string.
  
+ `replace(CharSequence target, CharSequence replacement)`

  Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
  
+ `split(String regex)`

  Splits this string around matches of the given regular expression.
  
+ `startsWith(String prefix)`

  Tests if this string starts with the specified prefix.
  
+ `substring(int beginIndex, int endIndex)`

  Returns a new string that is a substring of this string.
  
+ `toLowerCase()`

  Converts all of the characters in this String to lower case using the rules of the default locale.
  
+ `toUpperCase()`

  Converts all of the characters in this String to upper case using the rules of the default locale.
  
Refer to [the official documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)) for the entire list of String methods.
