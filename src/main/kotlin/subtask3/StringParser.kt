package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val result: MutableList<String> = mutableListOf()

        inputString.forEachIndexed { index, value ->
            val extracted: String? = when (value) {
                '(' -> treatment(inputString.drop(index + 1), '(', ')')
                '[' -> treatment(inputString.drop(index + 1), '[', ']')
                '<' -> treatment(inputString.drop(index + 1), '<', '>')
                else -> null
            }
            if (extracted != null) result.add(extracted)
        }
        return result.toTypedArray()
    }

    private fun treatment(str: String, opener: Char, closer: Char): String? {
        var counter = 1
        str.forEachIndexed { index, value ->
            if (value == opener) ++counter
            if (value == closer) --counter
            if (counter  == 0) return str.take(index)
        }
        return null
    }
}

