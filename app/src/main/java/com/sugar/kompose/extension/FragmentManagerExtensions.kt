//import android.app.Fragment
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//
//fun FragmentManager.push(
//    fragment: Fragment,
//    intAnim: Int? = null,
//    outAnim: Int? = null,
//    container: Int,
//    allowAddToBackStack: Boolean = false
//) {
//    beginTransaction().apply {
//        if (intAnim != null && outAnim != null)
//            setCustomAnimations(intAnim, outAnim)
//    }
//        .add(container, fragment, fragment::class.java.name)
//        .also {
//            if (allowAddToBackStack) {
//                it.addToBackStack(fragment::class.java.name)
//            }
//        }
//        .commitAllowingStateLoss()
//}
//
//fun FragmentManager.replace(
//    fragment: Fragment,
//    intAnim: Int? = null,
//    outAnim: Int? = null,
//    container: Int,
//    allowAddToBackStack: Boolean = false
//) {
//    beginTransaction().apply {
//        if (intAnim != null && outAnim != null)
//            setCustomAnimations(intAnim, outAnim)
//    }
//        .replace(container, fragment, fragment::class.java.name)
//        .also {
//            if (allowAddToBackStack) {
//                it.addToBackStack(fragment::class.java.name)
//            }
//        }
//        .commitAllowingStateLoss()
//}
//
//fun FragmentManager.remove(
//    fragment: Fragment,
//    intAnim: Int? = null,
//    outAnim: Int? = null,
//) {
//    beginTransaction().apply {
//        if (intAnim != null && outAnim != null)
//            setCustomAnimations(intAnim, outAnim)
//    }
//        .remove(fragment)
//        .commitAllowingStateLoss()
//}
//
//fun FragmentManager.pop(): Boolean {
//    if (backStackEntryCount == 0) return false
//    val fragment = getBackStackEntryAt(backStackEntryCount - 1).name?.let {
//        findFragmentByTag(it)
//    } ?: return false
//    remove(fragment)
//    return true
//}
//
//fun FragmentManager.get(name: String): Fragment? {
//    return findFragmentByTag(name)
//}
//
//fun FragmentManager.count(name: String): Int {
//    return this.fragments.count { it::class.java.name == name }
//}