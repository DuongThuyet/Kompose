


fun Long?.valueOrZero():Long = this ?:0L

fun Long.toMillis():Long = if (this > 1L || this == 1L ) this * 1000 else 0L

fun Long?.isNotNull():Boolean = this != null

fun Long?.isValid():Boolean = this.valueOrZero()  > 1L

fun Long?.isNotNullAndValid():Boolean = this.isNotNull() && this.isValid()
fun Long?.isUniformNotNullAndValid():Boolean = this.isNotNull() && this.valueOrZero()  > 4L
