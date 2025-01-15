```groovy
def myMethod(String str) {
  if (str == null) {
    return "null input"
  }
  if (!(str instanceof String)) {
    return "Invalid input type: Expected String"
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: null input
println myMethod("hello") // Output: HELLO
println myMethod([])  // Output: Invalid input type: Expected String
```