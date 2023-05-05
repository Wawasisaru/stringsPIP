@file:Suppress("UNUSED_EXPRESSION")

fun main(args: Array<String>) {
    println(details("Nancy",21,"Kenya"))
    println(word("Travel"))
    person("Nancy")
    person("Wawasi")
    println(fruit("Mango"))

}
//1. Write a function that takes in 3 parameters, name, age, and country, and
    // returns a String with this structure “Hi, my name is x, I am y years old and I am from z.”
    // Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun details(name: String,age: Int,country: String): String{
    return "Hi, my name is $name, I am $age years old and I am from $country"

}
//2. Write a function that takes in a String and returns its length (2 points)
fun word(name : String): Int{
    return name.length
}
//3. Write a function that takes in a name and prints out “That’s me!”
    // when your name is passed to it, otherwise, it prints out
    // “I don’t know who that is” (3 points)
fun person(name1: String){
    if(name1 == "Nancy"){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }
}
//4. Write a Kotlin function that takes in a string will
    // all the vowels replaces by the character ‘*’. Use string interpolation
    // to generate the output. (2 points)
fun fruit(sweet: String): String {
    val output = sweet.replace("[a,e,i,o,u]".toRegex(),"*")
    return "$output"

}


//fun student(name2: String): String{
//    val vowel = ('a';'e';'i';'o';'u';'A';'E';'I';'O';'U')
//    var output = ""
//    for (char in name2){
//        if(char in vowel){
//            output += "*"
//        }else{
//            output += char
//        }
//    }
//    return " $name2"
//
//}



