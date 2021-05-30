package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
val schet = (bill.sum()-bill[k])/2
        if(schet==b)
        {
            return "bon appetit"
        }
        else
            return (b-schet/2).toString()






    }
}
