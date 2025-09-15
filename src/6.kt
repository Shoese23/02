fun main() {
    print("Введите первое число:")
    val chast01 = readln()
    print("Введите второе число:")
    val chast02 = readln()

    var chetNechet = false

    val chast01ALL = chast01 + chast02
    if (chast01ALL.toInt() % 2 == 1) {
        println("Нечетное число - $chast01ALL")
        chetNechet = true
    }
    val chast02ALL = chast02 + chast01
    if (chast02ALL.toInt() % 2 == 1) {
        println("Нечетное число - $chast02ALL")
        chetNechet = true
    }
    if (!chetNechet) {
        println("Нечетное число создать не возможно.")
    }
}