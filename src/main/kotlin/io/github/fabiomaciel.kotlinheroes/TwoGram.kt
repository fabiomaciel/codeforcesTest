package io.github.fabiomaciel

//object programkt{
object TwoGram {
    @JvmStatic
    fun main(vararg args: String){
        val n = readLine()!!.toInt()
        val str = readLine()!!
        val result = exec(n, str)
        println(result)
    }

    fun exec(n: Int, str: String): String {
        var tg = Pair(-1, "")
        for(i in 0 until n-1){
            val sub = "${str[i]}${str[i+1]}"
            var count = 0
            for(i in 0 until str.length-1){
                if(str[i] == sub[0] && str[i+1] == sub[1]) count++
            }
            if(count > tg.first){
                tg = Pair(count, sub)
            }
        }
       return tg.second
    }

}
