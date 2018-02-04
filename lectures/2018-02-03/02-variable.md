# Variable

+ [Types](#types)
+ [Naming Convention](#naming-convention)
+ [Syntax](#syntax)
+ [Output to Console](#output-to-console)

## Types

+ Integer `int`
  + i.e. `3` and `-7`
  + `2147483647`
  
+ Decimal `double` and `float`
  + i.e. `-2.0` and `3.141592`
  + `double` has more precision.
  
+ Boolean `boolean`
  + Either `true` or `false`
  
+ Character `char`
  + Single letter
  + i.e. `'a'`, `'1'`, and `'@'`
  
+ String `String`
  + Sequence of characters
  + i.e. `"S"`, `"String"`, and `"Hello World"`
  
## Naming Convention

The name of variables should (but not must) be in [CamelCase](https://en.wikipedia.org/wiki/Camel_case) starting with lowercase letter (i.e. myFullName).

## Syntax

+ Definition of a variable with an initial value.
  ```java
  int anyNumber = 814;
  ```

+ Definition of a variable without initialization.
  ```java
  String nothing;
  ```
  Or
  ```java
  String nothing = null;
  ```

## Output to Console

```java
System.out.println(/* expression goes here */);
```

As IntelliJ supports autocompletion, you can simply type `sout` + <kbd>Enter</kbd>.
