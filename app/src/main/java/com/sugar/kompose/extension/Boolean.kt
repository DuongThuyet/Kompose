

fun Boolean?.valueOrDefault(default:Boolean):Boolean = this ?: default

fun Boolean?.valueOrFalse():Boolean = this ?: false