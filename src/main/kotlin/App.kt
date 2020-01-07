import challanges.FizzBuzz.fizzBuzz
import challanges.stacks.isBalanced
import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val s = Stack<Int>()
    val l = Stack<Int>()
    s.push(1)
    s.push(2)
    s.push(3)
    s.push(4)
    s.push(1000000000)

    println("Stack - 1 -> $s --- Stack - 2 -> $l")
    println(s.peek())
    val len = s.size
    l.addAll(s)
    /*s.forEach {
        l.push(it)
    }*/
    println(l.peek())
    println("Stack - 1 -> $s --- Stack - 2 -> $l")
}