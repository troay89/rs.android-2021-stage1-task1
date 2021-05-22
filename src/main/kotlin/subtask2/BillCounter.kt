package subtask2

import com.sun.xml.internal.fastinfoset.util.StringArray

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        for ((index, element) in bill.withIndex()) {
            if( index == k) continue
            sum += element
        }
        val fairScore = b - sum / 2
        if (fairScore == 0) return "Bon Appetit"
        return fairScore.toString()
    }
}

