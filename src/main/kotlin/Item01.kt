/*
아이템 1. 가변성을 제한하라
 */
/**
 * 코틀린은 모듈로 프로그램을 설계합니다.(https://smoh.tistory.com/226)
 * 모듈은 클래스, 객체, 함수, 타입별칭(https://iosroid.tistory.com/69), 톱레벨 프로퍼티(https://codechacha.com/ko/kotlin-visibility-modifiers/) 등 다양한 요소로 구성됩니다.
 * 이러한 요소 중 일부는 상태(state)를 가질수 있습니다.
 */
//var a = 10
//var list: MutableList<Int> = mutableListOf()
//
//class BankAccount {
//    var balance = 0.0
//        private set
//
//    fun deposit(depositAmount: Double) {
//        balance += depositAmount
//    }
//
//    @Throws(InsufficientFunds::class)
//    fun withdraw(withdrawAmount: Double) {
//        if (balance < withdrawAmount) {
//            throw InsufficientFunds()
//        }
//        balance -= withdrawAmount
//    }
//}
//
//class InsufficientFunds : Exception()

//fun main1() {
//    val account = BankAccount()
//
//    println(account.balance)
//    account.deposit(100.0)
//    println(account.balance)
//    account.deposit(50.0)
//    println(account.balance)
//    multithread()
//    multithreadLock()
//}

//fun multithread() {
//    var num  = 0
//    for (i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            num += 1
//
//        }
//    }
//    Thread.sleep(5000)
//    print(num)
//}
//fun multithreadLock() {
//    val lock = Any()
//    var num  = 0
//    for (i in 1..1000) {
//        thread {
//            Thread.sleep(10)
//            synchronized(lock){
//                num += 1
//            }
//        }
//    }
//    Thread.sleep(5000)
//    print(num)
//}

//fun main(){
//    val a = 10
////    a = 20
//    val list = mutableListOf(1,2,3)
//    list.add(4)
//    println(list)
//}


//var name: String ="Marcin"
//var surname: String= "Moskala"
//val fullName
//    get() = "$name $surname"
//fun main() {
//    println(fullName)
//    name = "Maja"
//    println(fullName)
//}

//fun calculate(): Int {
//    println("Calculating...")
//    return 42
//}
//val fizz = calculate()
//val buzz
//    get() = calculate()
//
//fun main() {
//    println("---")
//    println(fizz)
//    println("---")
//    println(fizz)
//    println("---")
//    println(fizz)
//    println("---")
//    println(buzz)
//    println("---")
//    println(buzz)
//    println("---")
//    println(buzz)
//    println("---")
//}


//interface Element {
//    val active: Boolean
//}
//
//class ActualElement : Element {
//    override var active: Boolean = false
//}
//
//fun main(args: Array<String>) {
//    val a = ActualElement()
////    a.active = true
//
//    println(a.active)
//
//}


//val name: String? = "Martom"
//val surname: String = "braun"
//
//val fullName: String?
//    get() = name?.let { "$it $surname" }
//val fullName2: String? = name?.let {
//    "$it $surname"
//}
//
//fun main() {
//    if (fullName != null) {
//        println(fullName.length)
//    }
//    if (fullName2 != null) {
//        println(fullName2.length)
//    }
//}


//class User(
//    val name : String, val surname: String
//){
//    fun withSurname(surname: String) = User(name, surname)
//}
//
//fun main() {
//    var user = User("maja","markiewicz")
//    user = user.withSurname("moskala")
//    println(user.name)
//    println(user.surname)
//}


//
//data class User(
//    val name : String, val surname: String
//)

//fun main() {
//    var user = User("maja", "mark")
//    user = user.copy(surname = "mosa")
//    print(user)
//}


//class FullName(var name: String, val first: String)
//
//
//fun main() {
//    val names: SortedSet<FullName> = TreeSet()
//    val person = FullName("AAA", "AAA")
//    names.add(person)
//    names.add(FullName("Jordan", "Hansen"))
//    names.add(FullName("David", "Blanc"))
//
//    print(names)//[AAAAAA,DavidBlanc,JordanHansen]
//    print(person in names)//true
//
//    person.name = "ZZZ"
//    print(names)//[ZZZAAA,DavidBlanc,JordanHansen]
//    print(person in names)//false
//
//}


//data class User(
//    val name: String,
//    val surname: String
//)
//
//fun main(args: Array<String>) {
//    var user = User("Maja","Markiewicz")
//    user = user.copy(surname = "Moskała")
//    print(user) // User(name=Maja,surname=Moskała)
//}


//var list2 = mutableListOf<Int>()
//fun main() {
////    val list = mutableListOf<Int>()
////    val list: MutableList<Int> = mutableListOf()
//    var list: List<Int> = listOf()
//    list2 += 1
//    for (i in 1..1000) {
//
//        println(i)
//        thread {
//            list += i
//            Thread.sleep(1000)
//        }
//    }
//    println(list.size)
//}
//

//fun main(args: Array<String>) {
//    var names by Delegates.observable(listOf<String>()){ _, old, new->
//        println("Names changed from $old to $new ")
//    }
//
//    names += "Fabio"
////Nameschangedfrom[]to[Fabio]
//    names += "Bill"
////Nameschangedfrom[Fabio]to[Fabio,Bill]
//}


//data class User(val name: String)
//
//data class MutableUser(val name: String = "init")
//
//class UserHolder {
//    private val user: MutableUser()
//
//    fun get(): MutableUser {
//        return user.copy()
//    }
//    // ...
//}
//
//fun main(args: Array<String>) {
//    val uh = UserHolder()
//    println(uh.toString())
//}


//data class User(val name: String)
//
//class UserRepository {
//    private val storedUsers: MutableMap<Int, String> = mutableMapOf()
//
//    fun loadAll(): Map<Int, String> {
//        return storedUsers
//    }
//    //...
//}
//
//fun main() {
//    // 이럴때 위험하다
//    val userRepository = UserRepository()
//
//    val storedUsers = userRepository.loadAll()
//    storedUsers.get(0)
//    storedUsers[0] = "Kirill"
//
//    print(userRepository.loadAll()) // {4=Kirill}
//}