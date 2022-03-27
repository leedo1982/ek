//class Forest(val name: String) {
//    fun addTree(name: String) {
//        println(name)
//        // ...
//    }
//}
//
//interface Tree
//class Birch : Tree
//class Spruce : Tree
//
//class Forest<T : Tree> {
//
//    fun addTree(tree: T) {
//// ...
//    }
//}
//
//fun main() {
////    val b = Birch()
//    val forest = Forest<Birch>()
//    forest.addTree(Birch())
//    forest.addTree(Spruce())
//
//}

//fun main() {
//    val anys: Cup<Any> = Cup<Int>() // Error: Type mismatch
//    val nothings: Cup<Nothing> = Cup<Int>() // Error
//}

//class Cup<out T>
//open class Dog
//class Puppy : Dog()
//
//fun main(args: Array<String>) {
//    val b: Cup<Dog> = Cup<Puppy>() // OK
//    val a: Cup<Puppy> = Cup<Dog>() // Error
//
//    val anys: Cup<Any> = Cup<Int>() // OK
//    val nothings: Cup<Nothing> = Cup<Int>() // Error
//}


//class Cup<in T>
//open class Dog
//class Puppy() : Dog()
//
//fun main(args: Array<String>) {
//    val b: Cup<Dog> = Cup<Puppy>() // Error
//    val a: Cup<Puppy> = Cup<Dog>() // OK
//
//    val anys: Cup<Any> = Cup<Int>() // Error
//    val nothings: Cup<Nothing> = Cup<Int>() // OK
//}

//fun printProcessedNumber(transition: (Int) -> Any) {
//    print(transition(42))
//}
//
////Based on its definition, such a function can accept a function of
////type (Int)->Any, but it would also work with: (Int)->Number,
////(Number)->Any, (Number)->Number, (Any)->Number, (Number)->Int,
////etc.
//val intToDouble: (Int) -> Number = { it.toDouble() }
//val numberAsText: (Number) -> Any = { it.toShort() }
//val identity: (Number) -> Number = { it }
//val numberToInt: (Number) -> Int = { it.toInt() }
//val numberHash: (Any) -> Number = { it.hashCode() }
//printProcessedNumber(intToDouble)
//printProcessedNumber(numberAsText)
//printProcessedNumber(identity)
//printProcessedNumber(numberToInt)
//printProcessedNumber(numberHash)


// Java
//Integer[] numbers = { 1, 4, 2, 1 };
//Object[] objects = numbers;
//objects[2] = "B"; // Runtime error: ArrayStoreException


class CoffeeMachine {
    fun makeCoffee() {
        boilWater()
        brewCoffee()
        pourCoffee()
        pourMilk()
    }

    private fun boilWater() {
// ...
    }

    private fun brewCoffee() {
// ...
    }

    private fun pourCoffee() {
// ...
    }

    private fun pourMilk() {
// ...
    }
}