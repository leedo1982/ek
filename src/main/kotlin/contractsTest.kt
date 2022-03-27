import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
fun isNotNull2(value: Any?): Boolean {

    contract {
        returns(true) implies (value != null)
    }

    println("value = $value")
    return false
}

@ExperimentalContracts
fun main(args: Array<String>) {
    val nullableInt: Int? = null

    println("test" + (nullableInt != null))

    println("isnotnull: " + isNotNull2(nullableInt))

    if (isNotNull2(nullableInt)) {
        val nonNullInt: Int = nullableInt //에러가 발생하지 않습니다.
    }

    val str : String? = "test"
    println("str test: "+ str.isNullOrEmpty())

}

@ExperimentalContracts
fun String?.isNullOrEmpty(): Boolean {
    contract {
        returns(false) implies (this@isNullOrEmpty != null)
    }
    return this == null || isEmpty()
}