package org.example

//1. Inline Functions
//What is it?
//An inline function is a function where the compiler copies the function’s code directly to the call site (where it’s used) instead of generating a function call. This reduces overhead, especially when using lambdas as parameters.
//
//Why use it?
//Improves performance for higher-order functions (functions that take lambdas as parameters).
//
//Avoids runtime overhead of lambda object creation.


fun main() {
//performOperation {
//    println("Performing a task...")
//}

    measureTime {
        for (i in 1..50) {
            println("Hello, World!")
        }
    }


}

//fun performOperation(op:() -> Unit) {
//    println("Performing operation...")
//    op()
//    println("Operation completed.")
//}


inline fun measureTime(block: () -> Unit) {
    val startTime = System.currentTimeMillis()
    block() // Call the passed-in block of code
    val endTime = System.currentTimeMillis()
    println("Execution time: ${endTime - startTime} ms")
}