import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.sugar.kompose.R

object Fonts {
    val roboto = FontFamily(
        Font(R.font.roboto, FontWeight.Normal),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold),
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_thin, FontWeight.Thin),
        Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    )
    val gilroy = FontFamily(
        Font(R.font.gilroy_regular, FontWeight.Normal),
        Font(R.font.gilroy_medium, FontWeight.Medium),
        Font(R.font.gilroy_bold, FontWeight.Bold),
        Font(R.font.gilroy_semi_bold, FontWeight.SemiBold),
    )
}