//import java.lang.Thread.sleep

//val a = 1
//fun fizz() {
//    val b = 2
//    println(a + b)
//}
//
//val buzz = {
//    val c = 3
//    print(a + c)
//}

//
//fun main() {
//    // 나쁜예
//    var user: User
//    for (i in user.indices) {
//        user = users[i]
//        print("User at $i is$user")
//    }
//
//    // 조금 더 좋은예
//    for (i in user.indices) {
//        val user = users[i]
//        print("User at $i is$user")
//    }
//
//    // 제일 좋은 예
//    for ((i, user) in user.withIndex()) {
//        print("User at $i is$user")
//    }
//}

//fun main() {
//    val primes: Sequence<Int> = sequence {
//        var numbers = generateSequence(2) { it + 1 }
//        var prime: Int
//        while (true) {
//            prime = numbers.first()
////            yield(prime)
//            println(prime)
//            numbers = numbers.drop(1).filter { it % prime != 0 }
//        }
//    }
//    print(primes.take(10).toList())
//}

//
//data class User(val name:String)
//fun main() {
//// Bad
//    var user: User
//    var users = listOf(User("leedo"))
//    for (i in users.indices) {
//        user = users[i]
//        println("User at $i is $user")
//    }
//    // Better
//    for (i in users.indices) {
//        val user1 = users[i]
//        println("User at $i is $user1")
//    }
//    // Same variables scope, nicer syntax
//    for ((i, user2) in users.withIndex()) {
//        println("User at $i is $user2")
//    }
//}
//

//data class User(val name:String)
//fun main() {
//// Bad
//    val user: User
//    if (hasValue) {
//        user = getValue()
//    } else {
//        user = User()
//    }
//
//// Better
//    val user: User = if (hasValue) {
//        getValue()
//    } else {
//        User()
//    }
//
//}


//// Bad
//fun updateWeather(degrees: Int) {
//    val description: String
//    val color: Int
//    if (degrees < 5) {
//        description = "cold"
//        color = Color.BLUE
//    } else if (degrees < 23) {
//        description = "mild"
//        color = Color.YELLOW
//    } else {
//        description = "hot"
//        color = Color.RED
//    }
//    // ...
//}
//
//// Better
//fun updateWeather(degrees: Int) {
//    val (description, color) = when {
//        degrees < 5 -> "cold" to Color.BLUE
//        degrees < 23 -> "mild" to Color.YELLOW
//        else -> "hot" to Color.RED
//    }
//    // ...
//}


//fun main() {
//    var numbers = (2..100).toList()
//    val primes = mutableListOf<Int>()
//    while (numbers.isNotEmpty()) {
//        val prime = numbers.first()
//        primes.add(prime)
//        numbers = numbers.filter { it % prime != 0 }
//    }
//    print(primes) // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
//    // 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
//}


//fun main() {
//    val primes: Sequence<Int> = sequence {
//        var numbers = generateSequence(2) { it + 1 }
//
//        while (true) {
//            val prime = numbers.first()
////            println(prime)
//            yield(prime)
//            numbers = numbers.drop(1)
//                .filter { it % prime != 0 }
//        }
//    }
//    print(primes.take(10).toList())  // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
//}

//fun main() {
//    val primes: Sequence<Int> = sequence {
//        var numbers = generateSequence(2) { it + 1 }
//
//        var prime: Int
//        while (true) {
//            prime = numbers.first()
////            println(prime)
//            yield(prime)
//            numbers = numbers.drop(1)
//                .filter {
//                    println(it to prime)
//                    it % prime != 0
//                }
//        }
//    }
//    print(primes.take(10).toList()); // [2, 3, 5, 6, 7, 8, 9, 10, 11, 12]
//}

