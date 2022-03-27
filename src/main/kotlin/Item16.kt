//import java.util.*
//
//
//fun main() {
//}
//
//class Item16 {
//
//
//}
//
//class SourceEntity(var id: String, var category: String, var country: String, var description: String){
//
//}
//
//
//
//override fun saveCallResult(item: SourceResponse) {
//    var sourceList = ArrayList<SourceEntity>()
//    item.sources.forEach {
//        var sourceEntity = SourceEntity()
//        sourceEntity.id = it.id
//        sourceEntity.category = it.category
//        sourceEntity.country = it.country
//        sourceEntity.description = it.description
//        sourceList.add(sourceEntity)
//    }
//    db.insertSources(sourceList)
//}
//
//override fun saveCallResult(item: SourceResponse) {
//    val sourceEntries = item.sources.map(::sourceToEntry)
//    db.insertSources(sourceEntries)
//}
//
//private fun sourceToEntry(source: Source) = SourceEntity()
//    .apply {
//        id = source.id
//        category = source.category
//        country = source.country
//        description = source.description
//    }
