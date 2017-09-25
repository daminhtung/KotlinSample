package func.example.com.kotlinexample

/**
 * Created by macpro on 9/25/17.
 */

object PassAFunctionAsParameter {

    fun baseFunc(variableA: String, callbackFunc : () -> Unit){
        println("This is the first line of this func with variableA: $variableA")
        callbackFunc()
    }

    fun callBackFunc(){
        println("This is callback function")
    }
}
