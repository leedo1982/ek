//import java.io.File
//
//fun getPrinter(): Printer? {
//    return null
//}
//
//
//class Printer {
//    fun print() {
//        println("test")
//    }
//}
//
//fun main() {
//    val printer: Printer? = getPrinter()
////    printer.print() // 컴파일 오류
//
//    printer?.print() // 안전 호출
//    if (printer != null) printer.print() //  스마트 캐스팅
////    printer!!.print() // not-null assertion
//
//
//}
//
//fun countCharactersInFile(path: String): Int =
//    File(path).useLines { lines ->
//        lines.sumOf { it.length }
//    }