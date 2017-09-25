package func.example.com.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Pass A function as parameter to other
        //"Hello David !" : Parameter 1
        // {PassAFunctionAsParameter.callBackFunc()} : Parameter 2 is a function
        PassAFunctionAsParameter.baseFunc("Hello David !", {PassAFunctionAsParameter.callBackFunc()})
    }


}
