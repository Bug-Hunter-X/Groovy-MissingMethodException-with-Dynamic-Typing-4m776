```groovy
def myMethod(String str) {
  if (str == null) {
    return "null input"
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: null input
println myMethod("hello") // Output: HELLO
println myMethod([]) // Exception: groovy.lang.MissingMethodException: No signature of method: java.lang.String.toUpperCase() is applicable for argument types: (java.util.ArrayList) values: [[Ljava.lang.String;@6d06d69d]
```