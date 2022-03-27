import java.time.Instant

//fun main() {
//    val name: String by lazy { getName() }
//    println("안녕1")
//    val name2: String by lazy { name }
//    println("안녕2")
//    println(name)
//    println(name2)
//    println(name)
//    println(name2)
//
//    lateinit var name3: String
//}
//
//fun getName(): String {
//    println("이름 계산중 ...")
//    return "Frank 현성 Oh"
//}


//data class Person(val name: String, val registered: Instant = Instant.now())
//
//fun show(persons: List<Person>){
//    for ((dat, name) in persons) {
//        println(dat + "'s registration date: " + name)
//    }
//}
//fun show2(persons: List<Person>){
//    for (person in persons) {
//        println(person.component1() + "'s registration date: " + person.component2())
//    }
//}
//
//fun main(args: Array<String>) {
//    val persons = listOf(Person("Mike"), Person("paul"))
//    show(persons)
//}

//var name: String? = null
//    get() = field?.uppercase()
//
//fun main(args: Array<String>) {
//    name = "123"
//    println(name)
//}