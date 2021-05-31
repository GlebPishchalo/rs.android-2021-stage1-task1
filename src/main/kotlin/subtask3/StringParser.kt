package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {


        val result = arrayListOf<String>()
        var b = 0
        for (i in inputString.withIndex()){
            if (i.value == '[' || i.value == '<' || i.value == '('){
                val _bracket = when (i.value){
                    '[' -> ']'
                    '<' -> '>'
                    '(' -> ')'
                    else -> ' '
                }
                for (a in i.index + 1 until  inputString.length){
                    if (inputString[a] == i.value) b++
                    if (inputString[a] == _bracket){
                        if (b == 0) {
                            result.add(inputString.substring(i.index + 1 until a))
                        } else b--
                    }
                }

            }
        }

        return result.toTypedArray()
    }
}

