fun main() {
    val array = intArrayOf(2,23,43,54,6,456,675,35,243)

    val operation = { array: IntArray ->
        for (i in array.indices){
            if (i % 2 == 0){
                array[i] = array[i] / 2
            }else{
                array[i] = array[i] * 3
            }
        }
        array
    }

    println(operation(array).contentToString())
}