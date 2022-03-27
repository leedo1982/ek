//// 예제 1
//open class Animal
//class Zebra : Animal()
//
//
//fun main() {
//    var animal = Zebra()
//    animal = Animal() // 오류 type mismatch
//}


// 예제 2
//open class Car
//class Fait126 : Car()
//interface CarFactory {
//    fun produce(): Car
//}
//val DEFAULT_CAR: Car = Fait126()


//// 예제 3
//open class Car
//class Fait126 : Car()
//
//interface CarFactory {
//    fun produce() = DEFAULT_CAR
//}
//
//val DEFAULT_CAR: Car = Fait126()


//// 예제 4
//open class Car
//class Fait126 : Car()
//
//interface CarFactory {
//    fun produce() = DEFAULT_CAR
//}
//
//val DEFAULT_CAR = Fait126P()
//
//fun Fait126P() =  Fait126()
