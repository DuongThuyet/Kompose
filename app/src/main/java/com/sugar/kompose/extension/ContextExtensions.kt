
import android.content.BroadcastReceiver
import android.content.Context
import android.content.IntentFilter
import android.os.Build



fun Context.isNightMode(): Boolean {
    return resources.configuration.uiMode and
            android.content.res.Configuration.UI_MODE_NIGHT_MASK ==
            android.content.res.Configuration.UI_MODE_NIGHT_YES
}

fun Context.registerNotExportedReceiver(
    receiver: BroadcastReceiver?,
    filter: IntentFilter,
): android.content.Intent? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        registerReceiver(receiver, filter, Context.RECEIVER_NOT_EXPORTED)
    } else {
        registerReceiver(receiver, filter)
    }
}

fun Context.registerExportedReceiver(
    receiver: BroadcastReceiver?,
    filter: IntentFilter,
): android.content.Intent? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        registerReceiver(receiver, filter, Context.RECEIVER_EXPORTED)
    } else {
        registerReceiver(receiver, filter)
    }
}