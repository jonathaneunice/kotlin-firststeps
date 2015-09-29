
import java.util.Calendar
import java.util.TimeZone

fun main(args: Array<String>) {
    println("Hey!")
    println(joiner(arrayOf("this","that")))
    its_now()
}

fun its_now() {
    
    var tz = TimeZone.getTimeZone("UTC")
    var calendar = Calendar.getInstance(tz)
    var sinceEpoch = calendar.getTimeInMillis() / 1000L;

    println("It's now $sinceEpoch")

}

fun joiner(strings: Array<String>, sep : String = ", "): String {
    var s : String = ""
    var s_lastindex = strings.size() - 1
    println("size = ${strings.size()}")
    for ((i, si) in strings.withIndex()) { 
        s += si
        if (i < s_lastindex)
            s += sep
    }
    return s
}
