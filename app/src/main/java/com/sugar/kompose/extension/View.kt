//import android.content.Context
//import android.os.Build
//import android.view.View
//import androidx.appcompat.widget.AppCompatButton
//import androidx.appcompat.widget.AppCompatTextView
//import com.ahamove.library.R
//
//fun View.setButtonEnable(context: Context) {
//    (this as AppCompatButton).apply {
//        setBackgroundResource(R.drawable.button_selector_orange)
//        setTextColor(context.getColor(R.color.white))
//    }
//}
//fun View.setButtonDisable(context: Context) {
//    (this as AppCompatButton).apply {
//      setBackgroundResource(R.drawable.button_selector_grey)
//        setTextColor(context.getColor(R.color.secondary_70))
//    }
//}
//
//fun View.setButtonDisable(color: Int) {
//    (this as AppCompatButton).apply {
//      setBackgroundResource(R.drawable.button_grey_30)
//        setTextColor(color)
//    }
//}
//
//fun View.setTextViewEnable(context: Context) {
//    (this as AppCompatTextView).apply {
//        setBackgroundResource(R.drawable.button_selector_orange)
//        setTextColor(context.getColor(R.color.white))
//        this.requestLayout()
//    }
//}
//fun View.setTextViewDisable(context: Context) {
//    (this as AppCompatTextView).apply {
//        setBackgroundResource(R.drawable.button_grey_30)
//        setTextColor(context.getColor(R.color.white))
//        this.requestLayout()
//    }
//}