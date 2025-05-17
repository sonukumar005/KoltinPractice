package org.example

//2. Extension Functions
//What is it?
//A function that allows you to add new functionality to an existing class without inheriting or modifying the class itself.
//
//Why use it?
//Enhance classes you don’t own (e.g., String, List).
//
//Keep code organized with domain-specific operations.


fun String.reverseAndUppercase(): String {
    return this.reversed().uppercase()
}

fun main() {
//    val text = "olleh"
//    println(text.reverseAndUppercase())

    val x = 28232842
    println("$x is even: ${x.isEven()}") // true
}


fun Int.isEven(): Boolean{
    if(this % 2 == 0){
        return true
    }
    else
        return false
}