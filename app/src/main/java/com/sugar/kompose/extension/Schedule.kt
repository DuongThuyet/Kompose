import SingleTask.singleTaskTimer
import android.os.CountDownTimer

fun schedule(countdownTime: Long, callbackFunc: () -> Unit) {
    if (countdownTime > 1000L)
        object : CountDownTimer(countdownTime, 1000L) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                callbackFunc.invoke()
            }
        }.start()
    else callbackFunc.invoke()
}

fun schedule(countdownTime: Long, onTick: (Long) -> Unit, callbackFunc: () -> Unit) {
    if (countdownTime > 1000L)
        object : CountDownTimer(countdownTime, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                onTick.invoke(millisUntilFinished)
            }

            override fun onFinish() {
                callbackFunc.invoke()
            }
        }.start()
    else callbackFunc.invoke()
}

fun scheduleSingleTask(countdownTime: Long, callbackFunc: () -> Unit) {
    if (singleTaskTimer?.isNonNull().valueOrFalse()) {
        singleTaskTimer?.cancel()
        singleTaskTimer = null
    }
    if (countdownTime > 1000L) {
        singleTaskTimer = object : CountDownTimer(countdownTime, 1000L) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                callbackFunc.invoke()
            }
        }
        singleTaskTimer?.start()
    }
    else callbackFunc.invoke()
}

object SingleTask{
    var singleTaskTimer: CountDownTimer? = null
}