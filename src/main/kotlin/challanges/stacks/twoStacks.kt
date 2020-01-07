package challanges.stacks

import java.io.*
import java.util.*

fun twoStacks(){

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        val totalOperations = readLine()

        var stk1 = Stack<Int>()
        var stk2 = Stack<Int>()
        var inverted = false

        for(i in 0..totalOperations.toString().toInt()-1){
            val argLine = readLine().toString()
            val actionId = argLine.split(" ")[0]


            when(actionId.toInt()){
                1->{
                    val arg = argLine.split(" ")[1].toInt()
                    if(stk1.empty()){
                        stk1.push(arg)
                    }
                    else{
                        stk2.push(arg)
                        stk2.addAll(stk1)
                        /*stk1.forEach{
                            stk2.push(it)
                        }*/
                        stk1 = stk2
                        stk2 = Stack<Int>()
                    }
                }
                2->{
                    stk1.pop()
                }
                3->{

                    println(stk1.peek())

                }
            }
            //println("Stack - 1 -> $stk1 --- Stack - 2 -> $stk2")

        }



}