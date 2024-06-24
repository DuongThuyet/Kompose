

fun  <T>MutableList<T>?.valueOrEmpty() = this ?: mutableListOf()
fun  <T> List<T?>?.toAvailableMutableList(): MutableList<T>{
    var output = mutableListOf<T>()
    if (this.isNonNull())
        this?.forEach{
            it?.let { item->
                output.add(item)
            }
        }
    return  output
}