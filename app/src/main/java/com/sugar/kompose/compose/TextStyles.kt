
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object TextStyles {
    val Title = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeLarge,
        fontWeight = FontWeight.Medium,
        color = Colors.NeutralBack,
    )

    val SmallTitle = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeExtraBig,
        fontWeight = FontWeight.Medium,
        color = Colors.NeutralBack,
    )

    val Body = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeRegular,
        fontWeight = FontWeight.Normal,
        color = Colors.NeutralBack,
    )

    val BodyGrey = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeRegular,
        fontWeight = FontWeight.Normal,
        color = Colors.NeutralDark,
    )

    val H1 = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeBig,
        fontWeight = FontWeight.Medium,
        color = Colors.NeutralBack,
    )

    val H3 = TextStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeRegular,
        fontWeight = FontWeight.Medium,
        color = Colors.NeutralBack,
    )
    val TitleSpan = SpanStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeLarge,
        fontWeight = FontWeight.Medium,
        color = Colors.NeutralBack,
    )

    val BodySpan = SpanStyle(
        fontFamily = Fonts.roboto,
        fontSize = TextSizeRegular,
        fontWeight = FontWeight.Normal,
        color = Colors.NeutralBack,
    )
    val Heading2 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = 24.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 32.sp,
        color = Colors.NeutralBack,
    )
    val Heading3 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeLarge,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 32.sp,
        color = Colors.NeutralBack,
    )
    val Heading4 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeExtraBig,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp,
        color = Colors.NeutralBack,
    )
    val Heading5 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeBig,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 24.sp,
        color = Colors.NeutralBack,
    )
    val Heading6 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeRegular,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 20.sp,
        color = Colors.NeutralBack,
    )
    val Caption2 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeRegular,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W600,
        lineHeight = 20.sp,
        color = Colors.Gray80,
    )

    val Caption3 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeSmall,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W600,
        lineHeight = 16.sp,
        color = Colors.Gray80,
    )
    val Caption4 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeTiny,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W600,
        lineHeight = 14.sp,
        color = Colors.Gray80,
    )
    val Body2 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeBig,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W500,
        lineHeight = 24.sp,
        color = Colors.NeutralBack,
    )
    val Body3 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeRegular,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W500,
        lineHeight = 20.sp,
        color = Colors.NeutralBack,
    )
    val Body4 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeSmall,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W500,
        lineHeight = 16.sp,
        color = Colors.NeutralBack,
    )
    val Button3 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeRegular,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 20.sp,
        color = Colors.NeutralBack,
    )
    val OverlineTitle1 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeSmall,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 16.sp,
        color = Colors.NeutralBack,
        letterSpacing = 0.5.sp,
    )
    val OverlineTitle2 = TextStyle(
        fontFamily = Fonts.gilroy,
        fontSize = TextSizeTiny,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W700,
        lineHeight = 16.sp,
        color = Colors.NeutralBack,
    )

}