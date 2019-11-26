import challanges.FizzBuzz.fizzBuzz
import challanges.stacks.isBalanced

fun main(){

    val req = arrayListOf<String>()
    req.add("{[()]}")
    req.add("{[(])}")
    req.add("{{[[(())]]}}")

    req.forEach {
        println(isBalanced(it))
    }

}