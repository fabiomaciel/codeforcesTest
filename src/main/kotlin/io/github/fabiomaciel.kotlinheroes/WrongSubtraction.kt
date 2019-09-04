package io.github.fabiomaciel

//object programkt{
object WrongSubtraction {
    @JvmStatic
    fun main(vararg args: String){
        val (n, times ) = readLine()!!.split(' ').map { it.toInt() }
        val x = wrongSub(n, times)
        println(x)
    }

    fun wrongSub(n: Int, times: Int): Int {
        var total = n;
        for(i in 1..times){
            if(total % 10 == 0){
                total /= 10
            }else{
                total -= 1
            }
        }
        return total
    }

}
