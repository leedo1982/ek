import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

//@ExperimentalContracts
//fun invokeLambda(lambdaFunc: () -> Unit) {
//
////    contract {
////        callsInPlace(lambdaFunc, InvocationKind.AT_LEAST_ONCE)
////    }
//
//    lambdaFunc()
//}
//
//@ExperimentalContracts
//fun mai(): String {
//    var stringConstant: String
//    invokeLambda {
//        // captured values init is forbidden 에러
//        stringConstant = "hello world"
//    }
//
//    //variable must be initilized 에러
//    return stringConstant
//}