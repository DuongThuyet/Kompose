


fun Int?.valueOrZero():Int = this ?: 0
fun Int?.isNotZero():Boolean = this.valueOrZero() > 0
