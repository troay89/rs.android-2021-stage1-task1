package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()) return sadArray
        var happyArray: IntArray = transformation(sadArray)
        while(!checkHappy(happyArray)){
            happyArray = transformation(happyArray)
        }
        return happyArray
    }

    private fun transformation(sadArray: IntArray): IntArray{
        var count = 1
        var happyArray = intArrayOf()
        happyArray += sadArray[0]
        while (count < sadArray.size - 1) {
            if (sadArray[count] <= sadArray[count - 1] + sadArray[count + 1])
                happyArray += sadArray[count]
            count++
        }
        happyArray += sadArray[sadArray.size - 1]
        return happyArray
    }

    private fun checkHappy(array: IntArray): Boolean {
        var count = 1
        while (count < array.size - 1) {
            if (array[count] > array[count - 1] + array[count + 1]) return false
            count++
        }
        return true
    }
}
