# Groovy Dynamic Typing and MissingMethodException
This example demonstrates a common issue in Groovy related to its dynamic typing.  The `myMethod` function expects a String, but when a list is passed, a `MissingMethodException` occurs because `toUpperCase()` is not a method of lists.

The solution showcases how to handle this type of error using type checking or more robust input validation.