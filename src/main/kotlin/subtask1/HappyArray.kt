package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        val firstArray = sadArray.reversedArray()
        val happyArray = arrayListOf(firstArray[0])

        var left = 0


        for (i in 1 until firstArray.lastIndex) {
            if (firstArray[i] <= (firstArray[left] + firstArray[i + 1])) {
                happyArray.add(firstArray[i])
                left = i
            }
        }
        happyArray.add(firstArray[firstArray.lastIndex])
        return happyArray.toIntArray().reversedArray()
    }
}
