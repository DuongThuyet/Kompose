
import java.text.DecimalFormat

fun Double?.valueOrZero():Double = this ?: 0.0
fun Double?.valueOrDefault(default:Double): Double = this ?: default
fun Double?.isNotZero():Boolean = this.valueOrZero() > 0.0
fun Double?.isZero():Boolean = this.valueOrZero() == 0.0

fun Double?.ahaDriverPointFormat(): String{
    return this?.let { value ->
        try {
            val valueFormatted = if (value >= 1_000)
              19//  NumberUtils.formatNumber(value)
            else if (value >= 1) {
                DecimalFormat("#.0").format(value)
            } else {
              "0,0"
            }
            ""//valueFormatted.ahaDriverPointFormat()
        } catch (e: Exception) {
            "0"
        }
    } ?: run { "0" }

}
fun Double?.ahaDriverFinesFormat(): String{
    return this?.let { value ->
        try {
            val valueFormatted = if (value >= 1_000)
                19//NumberUtils.formatNumber(value)
            else if (value >= 1) {
                DecimalFormat("#.0").format(value)
            } else {
              "0,0"
            }
            ""//valueFormatted.ahaDriverPointFormat()
        } catch (e: Exception) {
            "0"
        }
    } ?: run { "0" }

}
