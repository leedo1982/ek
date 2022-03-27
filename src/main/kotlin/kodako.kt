// person 과 personDao 의 범위를 제한 합니다.

//
//val inserted: Boolean = run {
//    // person 과 personDao 의 범위를 제한 합니다.
//    val person: Person = getPerson()
//    val personDao: PersonDao = getPersonDao()
//    // 수행 결과를 반환 합니다.
//    personDao.insert(person)
//}
//
//fun getPerson(): Person = Person()
//
//
//class Person(val age: Int) {
//}
//
//
//fun printAge(person: Person): Int =
//    person.run {
//        age
//    }