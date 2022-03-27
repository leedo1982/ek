import kotlin.reflect.KProperty

//// View and resource binding example in Android
//private val button: Button by bindView(R.id.button)
//private val textSize by bindDimension(R.dimen.font_size)
//private val doctor: Doctor by argExtra(DOCTOR_ARG)
//
//// Dependency Injection using Koin
//private val presenter: MainPresenter by inject()
//private val repository: NetworkRepository by inject()
//private val vm: MainViewModel by viewModel()
//
//// Data binding
//private val port by bindConfiguration("port")
//private val token: String by preferences.bind(TOKEN_KEY)


//var token: String? = null
//    get() {
//        print("token returned value $field")
//        return field
//    }
//    set(value) {
//        print("token changed from $field to $value")
//        field = value
//    }
//
//var attempts: Int = 0
//    get() {
//        print("attempts returned value $field")
//        return field
//    }
//    set(value) {
//        print("attempts changed from $field to $value")
//        field = value
//    }

//var token: String? by LoggingProperty(null)
//var attempts: Int by LoggingProperty(0)
//
//private class LoggingProperty<T>(var value: T) {
//    operator fun getValue(
//        thisRef: Any?,
//        prop: KProperty<*>
//    ): T {
//        print("${prop.name} returned value $value")
//        return value
//    }
//
//    operator fun setValue(
//        thisRef: Any?,
//        prop: KProperty<*>,
//        newValue: T
//    ) {
//        val name = prop.name
//        print("$name changed from $value to $newValue")
//        value = newValue
//    }
//}

//@JvmField
//private val `token$delegate` =
//    LoggingProperty<String?>(null)
//var token: String?
//    get() = `token$delegate`.getValue(this, ::token)
//    set(value) {
//        `token$delegate`.setValue(this, ::token, value)
//    }

//class SwipeRefreshBinderDelegate(val id: Int) {
//    private var cache: SwipeRefreshLayout? = null
//
//    operator fun getValue(
//        activity: Activity,
//        prop: KProperty<*>
//    ): SwipeRefreshLayout {
//        return cache ?: activity
//            .findViewById<SwipeRefreshLayout>(id)
//            .also { cache = it }
//    }
//
//    operator fun getValue(
//        fragment: Fragment,
//        prop: KProperty<*>
//    ): SwipeRefreshLayout {
//        return cache ?: fragment.view
//            .findViewById<SwipeRefreshLayout>(id)
//            .also { cache = it }
//    }
//}

//val map: Map<String, Any> = mapOf(
// "name" to "Marcin",
// "kotlinProgrammer" to true
//)
//val name by map
//print(name) // Marcin
//
//inline operator fun <V, V1 : V> Map<in String, V>.getValue(thisRef: Any?, property: KProperty<*>): V1 =
// getOrImplicitDefault(property.name) as V1