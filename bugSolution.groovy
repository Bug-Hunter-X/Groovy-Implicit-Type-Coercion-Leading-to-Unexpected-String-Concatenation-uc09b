def myMethod(a, b) {
  if (a instanceof Integer && b instanceof Integer) {
    println a + b
  } else {
    println "Error: Both inputs must be integers"
  }
}

myMethod(1, '2')
myMethod(3, 4)