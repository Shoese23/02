fun main(){
    val sostav = readln().split(" ")
    var rez = 0.0
    if (sostav[2] == "+") {
        rez = sostav[0].toDouble() + sostav[1].toDouble()
    }
    if (sostav[2] == "-") {
        rez = sostav[0].toDouble() - sostav[1].toDouble()
    }
    if (sostav[2] == "*") {
        rez = sostav[0].toDouble() * sostav[1].toDouble()
    }
    if (sostav[2] == "/") {
        rez = sostav[0].toDouble() / sostav[1].toDouble()
    }

    println("Результат = $rez")
}