package challanges.stacks

import java.util.*

// Complete the isBalanced function below.
fun isBalanced(s: String): String {

    val holder = Stack<Char>()

    s.toCharArray().forEach {
        if(holder.empty()){
            holder.add(it)
        }else{
         if(match(holder.peek(),it)){
             holder.pop()
         }else{
             holder.push(it)
         }
        }
    }

    val response = if(holder.size==0) "YES" else "NO"
    return response
}

private fun match(holderChar:Char,arrChar: Char):Boolean{
    var response = false
    when(true){
        ((holderChar=='(')&&(arrChar==')'))-> response = true
        ((holderChar=='{')&&(arrChar=='}'))-> response = true
        ((holderChar=='[')&&(arrChar==']'))-> response = true
    }
    return response
}

