

fun String?.valueOrEmpty():String = this ?: ""

fun String?.valueOrDefault(default :String ):String = this ?: default

fun String?.isNotNullOrNotEmpty():Boolean = this.valueOrEmpty().isNotEmpty()

fun String?.formatVNNumberPhone():String{
    var output = ""
    try {
        output = if (this.isNotNullOrNotEmpty() && this?.length.valueOrZero() > 10 )
            "0${this?.takeLast(9)}"
        else this.valueOrEmpty()
    }catch (e : Exception){
        e.printStackTrace()
    }
    return output
}

fun String?.formatToEnglish():String{
    var output = ""
    if (this.isNotNullOrNotEmpty())
        output = convert(this.valueOrEmpty())
    return  output
}
fun convert(content: String): String {
    var str = content
    str = str.replace("à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ".toRegex(), "a")
    str = str.replace("è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ".toRegex(), "e")
    str = str.replace("ì|í|ị|ỉ|ĩ".toRegex(), "i")
    str = str.replace("ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ".toRegex(), "o")
    str = str.replace("ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ".toRegex(), "u")
    str = str.replace("ỳ|ý|ỵ|ỷ|ỹ".toRegex(), "y")
    str = str.replace("đ".toRegex(), "d")
    str = str.replace("À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ".toRegex(), "A")
    str = str.replace("È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ".toRegex(), "E")
    str = str.replace("Ì|Í|Ị|Ỉ|Ĩ".toRegex(), "I")
    str = str.replace("Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ".toRegex(), "O")
    str = str.replace("Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ".toRegex(), "U")
    str = str.replace("Ỳ|Ý|Ỵ|Ỷ|Ỹ".toRegex(), "Y")
    str = str.replace("Đ".toRegex(), "D")
    return str
}

fun String?.ahaDriverPointFormat(): String{
    return try {
        val f = this.valueOrDefault("0,0")
        if (f.contains(",0") || f == "0,0")
            f.replace(",0","")
        else
            f
    } catch (e: Exception) {
        "0,0"
    }
}




