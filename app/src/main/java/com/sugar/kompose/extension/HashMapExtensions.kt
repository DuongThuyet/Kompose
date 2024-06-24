

fun <V> HashMap<*, V>.get(key: Any, defaultValue: V): V {
    return get(key) ?: defaultValue
}